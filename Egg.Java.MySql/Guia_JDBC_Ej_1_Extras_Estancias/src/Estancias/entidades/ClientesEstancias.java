package Estancias.entidades;

/**
 *
 * @author Hector Cicutti
 */
public class ClientesEstancias {

    private Integer idCliente;
    private String nombre;
    private String calle;
    private Integer numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private String email;
    private String tipoVivienda;
    private String casaCalle;
    private Integer casaNumero;
    private String casaCodPos;
    private String casaCiudad;
    private String casaPais;

    public ClientesEstancias() {
    }

    public ClientesEstancias(Integer idCliente, String nombre, String calle, Integer numero, String codigo_postal, String ciudad, String pais, String email, String tipoVivienda, String casaCalle, Integer casaNumero, String casaCodPos, String casaCiudad, String casaPais) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
        this.tipoVivienda = tipoVivienda;
        this.casaCalle = casaCalle;
        this.casaNumero = casaNumero;
        this.casaCodPos = casaCodPos;
        this.casaCiudad = casaCiudad;
        this.casaPais = casaPais;
    }

   
    public Integer getId_cliente() {
        return idCliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCasaCalle() {
        return casaCalle;
    }

    public void setCasaCalle(String casaCalle) {
        this.casaCalle = casaCalle;
    }

    public Integer getCasaNumero() {
        return casaNumero;
    }

    public void setCasaNumero(Integer casaNumero) {
        this.casaNumero = casaNumero;
    }

    public String getCasaCodPos() {
        return casaCodPos;
    }

    public void setCasaCodPos(String casaCodPos) {
        this.casaCodPos = casaCodPos;
    }

    public String getCasaCiudad() {
        return casaCiudad;
    }

    public void setCasaCiudad(String casaCiudad) {
        this.casaCiudad = casaCiudad;
    }

    public String getCasaPais() {
        return casaPais;
    }

    public void setCasaPais(String casaPais) {
        this.casaPais = casaPais;
    }




}
