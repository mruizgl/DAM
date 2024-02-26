<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- Match the root element and transform it into <cifp> -->
  <xsl:template match="ies">
    <cifp>
      <!-- Copy the name of the institute to <nombre_instituto> -->
      <nombre_instituto>
        <xsl:value-of select="nombre"/>
      </nombre_instituto>
      
      <!-- Apply templates for the child elements of <ciclos> -->
      <xsl:apply-templates select="ciclos/ciclo"/>
    </cifp>
  </xsl:template>

  <!-- Match each <ciclo> element and transform it into the desired format -->
  <xsl:template match="ciclo">
    <ciclo>
      <!-- Copy the name of the cycle to <nombre> -->
      <nombre>
        <xsl:value-of select="nombre"/>
      </nombre>
      
      <!-- Extract the first two characters of the id attribute and transform them into <sigla> -->
      <sigla>
        <xsl:value-of select="substring(@id, 1, 2)"/>
      </sigla>
      
      <!-- Copy the degree to <grado> -->
      <grado>
        <xsl:value-of select="grado"/>
      </grado>
    </ciclo>
  </xsl:template>

</xsl:stylesheet>