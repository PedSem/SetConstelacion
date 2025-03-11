package SetConstelacion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste>satelites;
    private TipoCuerpoCeleste tipoCuerpoCeleste;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpoCeleste) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpoCeleste = tipoCuerpoCeleste;
        this.satelites=new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public TipoCuerpoCeleste getTipoCuerpoCeleste() {
        return tipoCuerpoCeleste;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return satelites=new HashSet<>(satelites);
    }
    public boolean AddSatelite(CuerpoCeleste cuerpoCeleste){
        if(cuerpoCeleste.tipoCuerpoCeleste==TipoCuerpoCeleste.LUNA){
            return satelites.add(cuerpoCeleste);
        }else{
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(satelites, that.satelites) && tipoCuerpoCeleste == that.tipoCuerpoCeleste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, satelites, tipoCuerpoCeleste);
    }

    @Override
    public String toString() {
        return "nombre " + nombre + '\'' + ", periodoOrbital " + periodoOrbital + ", tipoCuerpoCeleste " + tipoCuerpoCeleste;
    }

}
class Planeta extends CuerpoCeleste{
    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital,TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean AddSatelite(CuerpoCeleste cuerpoCeleste){
        return super.AddSatelite(cuerpoCeleste);
    }

}
class PlanetaEnano extends CuerpoCeleste{

    public PlanetaEnano(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA_ENANO);
    }

}
class Luna extends CuerpoCeleste{

    public Luna(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital,TipoCuerpoCeleste.LUNA);
    }

}
