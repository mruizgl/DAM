for $articulo in /neptuno/articulos/articulo
where $articulo/NombreCategoria = 'Bebidas'
return
  <articulo>
    <RefArticulo>{data($articulo/RefArticulo)}</RefArticulo>
    <ReferenciaProveedor>{data($articulo/ReferenciaProveedor)}</ReferenciaProveedor>
    <NombreArticulo>{data($articulo/NombreArticulo)}</NombreArticulo>
    <NombreCategoria>{data($articulo/NombreCategoria)}</NombreCategoria>
    <PrecioUnidad>{data($articulo/PrecioUnidad)}</PrecioUnidad>
    <UnidadesExistencia>{data($articulo/UnidadesExistencia)}</UnidadesExistencia>
  </articulo>