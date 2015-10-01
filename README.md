# rest-helloworldexception
This is example of exception in jersey framework or more precisely in JAVAX.WS.RS. Project is independent of IDE and you can build project using ant and then deploy.

In example we are throwing exception and as there is nothing to catch exception is finally reached to tomcat. Just fore an API using postman.

How to compile :-
1. You can create intellij/eclipse project but that will not give you exactly what is happening. So I used ant. You need to install ant but it is very simple and worth. Yes. Really worth!!!
2. Set up ant. Just google it. You need to install and set few environment variables.
3. Open command window and go to directory where your build.xml lies. That is inside your project directory. Though build.xml can lie anywhere.
4. type:
ant -Dproject.dir=D:\data\Share\github\rest-exception-not-handled -Dtomcat.path=D:\Other\apache-tomcat-7.0.55 -Dapp.name=helloworldexception build-app
5. Copy generate war to tomcat webapps directory. For me it is D:\Other\apache-tomcat-7.0.55\webapps
6. Start tomcat using startup.bat.
7. Hit http://localhost:8080/helloworldexception/api/v1/helloworld . This will throw exception and there is nothing to handle it and finally tomcat throws it.
8. Default app is ROOT so we need to specify application name before "api/v1/helloworld". But you can change default app to your app on production.
