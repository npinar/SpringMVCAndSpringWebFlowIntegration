This app shows you how you can integrate spring mvc with spring webflow.
I used Spring 3 MVC and Spring Webflow 2.3 for this sample app.

Here are the steps that explains what happens when you make a web request.

1) DispatcherServlet is the Spring MVC front controller and it receives any Spring MVC and Spring Webflow requests.

2) SimpleUrlHandlerMapping maps flow requests from DispatcherServlet to FlowController.

3) FlowController passes them to FlowExecutor for actual processing.

4) FlowExecutor gets the flow from the FlowRegistry.

5) You can see FlowBuilderServices in FlowRegistry declaration. It is just a container for various services that 
FlowRegistry needs when constructing flows. I  am using MvcViewFactoryCreator to create view factories for Spring MVC views.
MvcViewFactoryCreator references to ViewResolver which is a Spring MVC interface that maps logical view names to physical resources.






 
