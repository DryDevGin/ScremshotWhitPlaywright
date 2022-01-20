# ScremshotWhitPlaywright
clase para tomar SS a cualquier pagina
si usas eclipse es necesario agregar al pom
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	<maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>
  
  &&
  
  <dependency>
  <groupId>com.microsoft.playwright</groupId>
  <artifactId>playwright</artifactId>
  <version>1.12.0</version>
</dependency>

en mi caso ecplise me daba error en el objeto create ya que pedia un nivel 1.8 o superior, por lo que desde la carpeta padre de todas entras con 
click derecho a propiedades, java buil path, libraries, JavaSE y le das en edit, y en mi caso la cambie por java-SE11, aplicas y cierras en se quita el error
