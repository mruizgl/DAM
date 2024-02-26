<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <html>
      <head>
        <title>Informacion de modulos</title>
      </head>
      <body>
     
        <xsl:apply-templates select="ies/modulos/modulo"/>
      </body>
    </html>
  </xsl:template>


  <xsl:template match="modulo">
    <tr>
      
      <td>
        <xsl:value-of select="nombre"/>
      </td>
      
  
      <td>
        <xsl:value-of select="curso"/>
      </td>
      
    
      <td>
        <xsl:value-of select="substring(ciclo, 1, 2)"/>
      </td>
    </tr>
  </xsl:template>

</xsl:stylesheet>
