<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="file:discos.xsl" version="1.0">
  <xsl:template match="/">
  <html>
<body>
<h2>Mis CDs</h2>
<table>
<tr><th>Artista</th><th>Titulo</th></tr>
<xsl:for-each select = "//cd">
<tr>
<td><xsl:value-of select="titulo"/></td>
<td><xsl:value-of select="artista"/></td>
</tr>
</xsl:for-each>

</table>
</body>  
  </html>
  </xsl:template>
</xsl:stylesheet>
