<%-- Application header fragment. Intended to be included in another page.
     That page should have a reference to the stylesheet. --%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="jsf-in-action-components" prefix="jia"%>

<f:subview id="header">

  <h:form>

    <h:panelGrid columns="3" cellspacing="0" cellpadding="0"
                 styleClass="header" width="100%">

      <jia:navigatorToolbar id="toolbar" layout="horizontal"
           headerClass="toolbar-header" itemClass="toolbar-command"
           selectedItemClass="toolbar-command" iconClass="toolbar-icon"
           immediate="false">  <!>

        <f:facet name="header">
          <h:outputText value="ProjectTrack:"/>
        </f:facet>

        <jia:navigatorItem name="inbox" label="Inbox" icon="/images/inbox.gif"
                           action="inbox" disabled="#{!authenticationBean.allowInbox}"/>  <!>
        <jia:navigatorItem name="showAll" label="Show All" icon="/images/show_all.gif"
                           action="show_all"/>
        <jia:navigatorItem name="createNew" label="Create New" icon="/images/create.gif"
                           action="#{createProjectBean.create}" disabled="#{!authenticationBean.allowCreateNew}"/> <!>
        <jia:navigatorItem name="logout" label="Logout" icon="/images/logout.gif"
                           action="#{authenticationBean.logout}"/>                    <!>

    </jia:navigatorToolbar>

      <h:panelGroup>
        <h:outputLabel for="languageSelect">
          <h:outputText value="Language:"  styleClass="language-select"/>
        </h:outputLabel>
        <h:selectOneListbox id="languageSelect" size="1"
                            styleClass="language-select" value="#{visit.locale}">
          <f:selectItems value="#{visit.supportedtLocaleItems}"/>
        </h:selectOneListbox>
        <h:commandButton value="Go!" styleClass="language-select-button"/>
      </h:panelGroup>

      <h:outputText value="(#{visit.user.login})" styleClass="user-name"/> <!>

    </h:panelGrid>
  </h:form>
</f:subview>


