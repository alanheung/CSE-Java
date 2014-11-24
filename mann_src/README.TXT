JavaServer Faces in Action Example Code
Release 1.01 (11/01/2004)

This is the full set of source code for use with JavaServer Faces in Action by Kito D. Mann
(http://www.manning.com/mann/).

This code is released under the Apache Licese v2.0. See LICENSE-APACHE-2.txt for more information.
Several third-party libraries have been included, many of which have different licensing terms; see
THIRDPARTYLICENSE.TXT for details.

Organization
------------
This archive includes the following directories:

src                        - The primary Java source code
test                       - JUnit tests for some of the classes
classes.ant                - Compiled classes
webapps                    - Contains WARs for all of the web applications
webapps/hello-world        - The Hello, world! application
webapps/examples           - Examples from Part 1 of the book
webapps/ptrack-ui          - The ProjectTrack prototype from chapters 8 and 9
webapps/ptrack             - The full ProjectTrack case study application from chapters 10-13
webapps/custom-components  - Examples of the custom components, renderers, validators, and converters from
                             Parts 4 and 5
lib                        - Contains all third-party libraries and the custom component examples
                             (jia-custom-components.war). You can use the custom components in your
                             own projects by simply dropping jia-custom-components.war in your JSF
                             application's classpath (usually WEB-INF/lib).
custom-components          - Configuration files for the custom components (used by build_components.xml)

Requirements
------------
These examples require JDK 1.3 or higher and a web container that supports the Servlet API 2.3 or
higher and JSP 1.2 or higher, such as Tomcat or WebSphere. They were tested with JDK 1.4 and
Tomcat 5.0 on Windows XP. If you have problems with other configurations, please let me know.

Running the samples
-------------------
The webapps directory has all of the WAR files; simply copy them to the appropriate directory
for your web container (for Tomcat, this is the webapps directory).

Building the sample code
------------------------
All of the code has already been built, but you can rebuild it (perhaps to include your
modifications to files in the src or test directories) by using Apache Ant (http://ant.apache.org).
There are five Ant build files in the root directory:

build.xml                       - Master build file (calls files below)
build_hello.xml                 - Build file for Hello, world!
                                  Output: webapps/jia-hello-world.war
build_examples.xml              - Buld file for Part 1 examples
                                  Output: webapps/jia-examples.war
build_ptrack_ui.xml             - Build file for ProjectTrack UI prototype
                                  Output: webapps/jia-ptrack-ui.war
build_ptrack.xml                - Build file for ProjectTrack case study
                                  Output: webapps/jia-ptrack.war
build_components.xml            - Build file for sample components
                                  Output: lib/jia-custom-components.war
build_component_examples.xml    - Build file for sample component examples
                                  Output: webapps/jia-component-examples.war

To build the code, download and install Ant first if you haven't already. (You can get it
from http://ant.apache.org/bindownload.cgi). Once you've installed it, Ant should be
in your system path.

In order for the build to work properly, you must set the jdk.home property. You can do this either
by editing build.xml, or by specifying the property on the command line. So, if your JDK
home direcory is C:/jdk1.4, you would edit build.xml like so:

...
 <property name="jdk.home" value="C:/jdk1.4"/>
...

You can then execute ant like this:

ant [target]

Alternatively, you set the property when you call the script:

ant -Djdk.home=C:\jdk1.4 [target]

Where [target] is either "make" or "rebuild" (the default is "rebuild").

You can call the other build scripts individually by using the buildfile parameter:

ant -buildfile build_ptrack.xml [target]

If you call individual build files, you must specify the jdk.home property for that build
file either by editing it or setting it on the command line, as shown above.

The code includes unit tests, but they are not executed by Ant at this time.

Custom Component notes
----------------------

If you wish to use the custom components in your own applications, be sure to
include the Informa library (for UIHeadlineViewer) and JUnit (if you intend
to run unit tests) in the application's classpath. These can be found in the
/lib directory.

ProjectTrack case study notes
---------------------------------------------

- As discussed in the book, ProjectTrack stores all of the objects in memory.
When you restart the application, you will loose all changes.
- Only partially localized for Russian
- The JDBC version of the Inbox page covered in chapter 13 is included for
example purposes, but doesn't really integrate with the rest of the application.
ProjectTrack uses the Hypersonic database for this example. In order for it to
work properly, you must change the org.jia.ptrack.databaseUrl context parameter in
ProjectTrack's web.xml to point to the location of the Hypersonic database, which
is in the WEB-INF directory. So, if ProjectTrack is deployed in C:/webapps/ptrack,
the org.jia.ptrack.databaseUrl context parameter in the file c:/webapps/ptrack/WEB-INF.web.xml
would be "c:/webapps/ptrack/WEB-INF/DATASET".

Additional notes
----------------

The JSPs are not pre-compiled, so the pages will load slowly the first time.


Bug fixes
---------

v1.01 11/3/2004
  ProjectTrack (jia-ptrack.war)
    - The visit property of authenticationBean should not be a managed property;
      consequently the following declaration should be removed:

      <managed-property>
        <property-name>visit</property-name>
        <value>#{sessionScope.visit}</value>
      </managed-property>

      The authenticationBean.visit property is set during AuthenticationBean.login method,
      so it shouldn't be configured using managed beans.

    - The entries for NoProjectAdapter and NoProjectAdapter_detail are not used, and should
      be removed (they are artifacts of an older version of ProjectTrack).

    - Removed reference to currentProjectAdapter in faces-config.xml and ptrackResources*.properties.
      This was a class in an old version of ProjectTrack that no longer exists.

    - In show_all.jsp, an HtmlCommandLink component has an incorrect value, which ah

      <h:commandLink value="#{showAllBean.sort}" id="role"
                     styleClass="table-header"
                     actionListener="#{showAllBean.sort}">
        <h:outputText value="Waiting for"/>
        <f:param name="column" value="role"/>
      </h:commandLink>

      Has been changed to:

      <h:commandLink id="role"
                     styleClass="table-header"
                     actionListener="#{showAllBean.sort}">
        <h:outputText value="Waiting for"/>
        <f:param name="column" value="role"/>
      </h:commandLink>

    - In create.jsp, the <h:selectOneMenu> declaration was missing the id attribute. Here's the correct
      declaration:

      <h:selectOneMenu id="typeSelectOne"
                   binding="#{createProjectBean.projectSelectOne}">

    - Some debugging code in MemoryProjectCoordinator was throwing a DataStoreException whenever there
      are exactly 5 projects.

    - CreateProjectBean.add now returns either success_readonly or success_failure, which
      matches the navigation rules.

Known Issues
------------

UINavigator custom component

- Because value-binding expressions for items are evaluated immediately by the JSP custom tag,
the labels will not be updated if the value of the expression changes. This is why the toolbar
buttons in ProjectTrack do not update when the locale is changed.

Reporting bugs
--------------

If you have any problems with these examples, please contact the author, Kito D. Mann,
at kmann@jsfcentral.com.
