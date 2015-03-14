import java.util.ArrayList;
import java.io.*;
import javanet.staxutils.IndentingXMLStreamWriter; // "stax-utils.jar" needs to be added to Project
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;    // read
import javax.xml.stream.XMLStreamWriter;    // write
//import javax.xml.stream.*;  // StAX API

public class XMLTesterApp{
    private static String productsFilename = "products.xml";

    public static void main(String[] args){
        System.out.println("Products list:");
        ArrayList<Product> products = readProducts();
        displayProducts(products);

        Product p1 = new Product("test", "XML Tester", 77.77);
        products.add(p1);
        writeProducts(products);
        System.out.println("XML Tester has been added to the XML document.\n");

        System.out.println("Products list:");
        products = readProducts();
        displayProducts(products);

        products.remove(2);
        writeProducts(products);
        System.out.println("XML Tester has been deleted from the XML document.\n");

        System.out.println("Products list:");
        products = readProducts();
        displayProducts(products);
    }

    private static ArrayList<Product> readProducts(){
        ArrayList<Product> products = new ArrayList<>();
        Product p = null;

        // create the XMLInputFactory object
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        try{
            // create a XMLStreamReader object
            FileReader fileReader  = new FileReader(productsFilename);
            XMLStreamReader reader = inputFactory.createXMLStreamReader(fileReader);

            while (reader.hasNext()){
                int eventType = reader.getEventType();
                switch (eventType){
                    case XMLStreamConstants.START_ELEMENT:
                        String elementName = reader.getLocalName();
                        if (elementName.equals("Product")){
                            p = new Product();

                            // the simplest way
                            String code = reader.getAttributeValue(0);
                            p.setCode(code);

                            // a safer and more flexible way
                            /*
                            int count = reader.getAttributeCount();
                            for (int i = 0; i < count; i++)
                            {
                                if (reader.getAttributeLocalName(i).equals("Code"))
                                {
                                    String code = reader.getAttributeValue(i);
                                    p.setCode(code);
                                }
                            }
                            */
                        }
                        if (elementName.equals("Description")){
                            String description = reader.getElementText();
                            p.setDescription(description);
                        }
                        if (elementName.equals("Price")) {
                            String priceString = reader.getElementText();
                            double price = Double.parseDouble(priceString);
                            p.setPrice(price);
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        elementName = reader.getLocalName();
                        if (elementName.equals("Product")){
                            products.add(p);
                        }
                        break;
                    /*
                    case XMLStreamConstants.COMMENT:
                        System.out.println("Comment: " + reader.getText());
                        break;
                    */
                    default:
                        break;
                }
                reader.next();
            }
        } catch (FileNotFoundException | XMLStreamException e){
            System.out.println(e);
        }
        return products;
    }

    private static void writeProducts(ArrayList<Product> products){
        try{
            FileWriter fileWriter        = new FileWriter(productsFilename);
            XMLStreamWriter streamWriter = 
                    XMLOutputFactory.newInstance().createXMLStreamWriter(fileWriter);
            IndentingXMLStreamWriter writer = new IndentingXMLStreamWriter(streamWriter);
            writer.setIndent("\t");

            writer.writeStartDocument("1.0");
            // the manual attempt to format the document myself i.e. inserting "\n" where
            // required messed up the IndentingXMLStreamWriter so leave them out!!
            // http://grepcode.com/file/repo1.maven.org/maven2/net.java.dev.stax-utils/
            //  stax-utils/20060502/javanet/staxutils/IndentingXMLStreamWriter.java
//            writer.writeCharacters("\n");
            writer.writeComment("Product data");
//            writer.writeCharacters("\n");
            writer.writeStartElement("Products");
//            writer.writeCharacters("\n");
            for (Product p : products){
                writer.writeStartElement("Product");
                writer.writeAttribute("Code", p.getCode());
//                writer.writeCharacters("\n");

                writer.writeStartElement("Description");
                writer.writeCharacters(p.getDescription());
                writer.writeEndElement();
//                writer.writeCharacters("\n");

                writer.writeStartElement("Price");
                double price = p.getPrice();
                writer.writeCharacters(Double.toString(price));
                writer.writeEndElement();
//                writer.writeCharacters("\n");

                writer.writeEndElement();
//                writer.writeCharacters("\n");
            }
            writer.writeEndElement();
//            writer.writeCharacters("\n");
            writer.flush();
            writer.close();
        }
        catch (IOException | XMLStreamException e){
            System.out.println(e);
        }
    }

    private static void displayProducts(ArrayList<Product> products){
        for (Product p : products){
            printProduct(p);
        }
        System.out.println();
    }

    private static void printProduct(Product p){
        String productString =
            StringUtils.padWithSpaces(p.getCode(), 8) +
            StringUtils.padWithSpaces(p.getDescription(), 44) +
            p.getFormattedPrice();

        System.out.println(productString);
    }
}