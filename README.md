sh-manager
==========

Use this file to remember what and how!

Running
-------

### Use maven commands:

* Clean the project folder - `clean`
* Specify the environment variable - `-Dname=value`
* Run the application - `mvn clean jetty:run -Ddev.env=test`

Configurations
--------------

### MyBatis generator:

* Options - `-Dmybatis.generator.overwrite=true`. Existing Java files will be overwritten
* Run generator - `mvn mybatis-generator:generate`

### Logs:

Specify full path to logging dir via maven variable `sh.logdir`.
