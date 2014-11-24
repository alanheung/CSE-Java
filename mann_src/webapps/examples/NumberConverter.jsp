<%--
   JavaServer Faces in Action example code, Copyright (C) 2004 Kito D. Mann.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

--%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
<head>
	<title>JSF in Action - Number converter examples</title>
  <style>
   .errors { color: red }
  </style>
</head>
<body bgcolor="#ffffff">

<h1>Number converter examples</h1>
<p>
  The locale for this view is "en_US".
</p>
<f:view locale="en_US">
  <h:panelGrid columns="3" border="1" cellspacing="0" cellpadding="5">
    <h:outputText value="Comments"/>
    <h:outputText value="Output"/>
    <h:outputText value="Errors"/>

    <h:outputText value="default"/>
    <h:form>
      <h:inputText id="NumberInput1">
        <f:convertNumber/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="NumberInput1" styleClass="errors"/>

    <h:outputText value='maxFractionDigits="3" groupingUsed="true"'/>
    <h:form>
      <h:inputText id="NumberInput2">
        <f:convertNumber maxFractionDigits="3" groupingUsed="true"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="NumberInput2" styleClass="errors"/>

    <h:outputText value='type="percent" maxFractionDigits="2"'/>
    <h:form>
      <h:inputText id="PercentageInput1" value="#{user.balance}">
         <f:convertNumber type="percent" maxFractionDigits="2"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="PercentageInput1" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" type="percent"'/>
    <h:form>
      <h:inputText id="PercentageInput2" value="#{user.balance}">
         <f:convertNumber type="percent"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="PercentageInput2" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" type="currency" currencyCode="KZT"'/>
    <h:form>
      <h:inputText id="CurrencyInput1" value="#{user.balance}">
         <f:convertNumber type="currency" currencyCode="KZT"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="CurrencyInput1" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" type="currency"'/>
    <h:form>
      <h:inputText id="CurrencyInput2" value="#{user.balance}">
         <f:convertNumber type="currency"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="CurrencyInput2" styleClass="errors"/>

    <h:outputText value='value="#{user.balance} type="currency" minIntegerDigits="2"
                         maxIntegerDigits="5" maxFractionDigits="2"
                         currencySymbol="$"'/>
    <h:outputText id="CurrencyDigitsInput" value="#{user.balance}">
       <f:convertNumber type="currency" minIntegerDigits="2"
                        maxIntegerDigits="5" maxFractionDigits="2"
                        currencySymbol="$"/>
    </h:outputText>
    <h:message for="CurrencyDigitsInput" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" type="number" maxIntegerDigits="6" maxFractionDigits="2" groupingUsed="true"'/>
    <h:form>
      <h:inputText id="CurrencyInput3" value="#{user.balance}">
        <f:convertNumber type="number" maxIntegerDigits="6" maxFractionDigits="2"
                         groupingUsed="true"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="CurrencyInput3" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" pattern="###,###.##;(###,###.##)"'/>
    <h:form>
      <h:inputText id="PatternInput1" value="#{user.balance}">
        <f:convertNumber pattern="###,###.##;(###,###.##)"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="PatternInput1" styleClass="errors"/>

    <h:outputText value='value="{user.balance}" pattern="い4#,##0.00;(い#,##0.00)"'/>
    <h:form>
      <h:inputText id="PatternInput2" value="#{user.balance}">
        <f:convertNumber pattern="い#,##0.00;(い#,##0.00)"/>
      </h:inputText>
      <h:commandButton value="Go!"/>
    </h:form>
    <h:message for="PatternInput2" styleClass="errors"/>
 </h:panelGrid>
</f:view>

</body>
</html>
