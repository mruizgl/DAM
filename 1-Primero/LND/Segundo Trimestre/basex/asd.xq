for $baile in doc("baile.xml") //bailes/baile
where $baile/number(precio) > 70
return
<baile>
<nombre>{$baile/nombre/text()}</nombre>
<precio>{$baile/precio/text()}</precio>
</baile>