for $proveedor in /neptuno/proveedores/proveedor
where $proveedor/PaisProveedor = 'Francia'
return
  <proveedor>
    <ReferenciaProveedor>{data($proveedor/ReferenciaProveedor)}</ReferenciaProveedor>
    <NombreProveedor>{data($proveedor/NombreProveedor)}</NombreProveedor>
    <Direccion>{data($proveedor/DireccionProveedor)}</Direccion>
    <CodigoPostal>{data($proveedor/CodigoPostal)}</CodigoPostal>
    <Pais>{data($proveedor/PaisProveedor)}</Pais>
    <Telefono>{data($proveedor/TelefonoProveedor)}</Telefono>
  </proveedor>
