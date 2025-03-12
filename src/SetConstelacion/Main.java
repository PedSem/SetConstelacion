package SetConstelacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,CuerpoCeleste>sistemasolar=new HashMap<>();
    private static Set<CuerpoCeleste>planetas=new HashSet<>();

    public static void main(String[] args) {

        CuerpoCeleste Mercurio=new Planeta("Mercurio",88);
        sistemasolar.put(Mercurio.getNombre(),Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus=new Planeta("Venus",225);
        sistemasolar.put(Venus.getNombre(), Venus);
        planetas.add(Venus);

        CuerpoCeleste latierra=new Planeta("La Tierra",365);
        sistemasolar.put(latierra.getNombre(), latierra);
        planetas.add(latierra);

        CuerpoCeleste Marte=new Planeta("Marte",687);
        sistemasolar.put(Marte.getNombre(),Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter=new Planeta("Jupiter",4332);
        sistemasolar.put(Jupiter.getNombre(),Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno=new Planeta("Saturno",10759);
        sistemasolar.put(Saturno.getNombre(), Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano=new Planeta("Urano",30660);
        sistemasolar.put(Urano.getNombre(), Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno=new Planeta("Neptuno",165);
        sistemasolar.put(Neptuno.getNombre(), Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton=new Planeta("Pluton",248);
        sistemasolar.put(Pluton.getNombre(),Pluton);
        planetas.add(Pluton);

        CuerpoCeleste Luna=new Luna("Luna",27);
        sistemasolar.put(Luna.getNombre(), Luna);
        latierra.AddSatelite(Luna);

        CuerpoCeleste Deimos=new Luna("Deimos",1.3);
        sistemasolar.put(Deimos.getNombre(), Deimos);
        Marte.AddSatelite(Deimos);

        CuerpoCeleste Phobos=new Luna("Phobos",0.3);
        sistemasolar.put(Phobos.getNombre(),Phobos);
        Marte.AddSatelite(Phobos);

        CuerpoCeleste Io=new Luna("Io",1.8);
        sistemasolar.put(Io.getNombre(), Io);
        Jupiter.AddSatelite(Io);

        CuerpoCeleste Europa=new Luna("Europa",3.5);
        sistemasolar.put(Europa.getNombre(), Europa);
        Jupiter.AddSatelite(Europa);

        CuerpoCeleste Ganymede=new Luna("Ganymede",7.1);
        sistemasolar.put(Ganymede.getNombre(), Ganymede);
        Jupiter.AddSatelite(Ganymede);

        CuerpoCeleste Callisto=new Luna("Callisto",16.7);
        sistemasolar.put(Callisto.getNombre(), Callisto);
        Jupiter.AddSatelite(Callisto);

        System.out.println("Todos los planetas");
        for(CuerpoCeleste cuerpoCeleste:planetas){
            System.out.println(cuerpoCeleste.getNombre());
        }
        System.out.println();
        System.out.println("Las lunas de " + Marte.getNombre());
        for(CuerpoCeleste cuerpoCeleste: Marte.getSatelites()){
            System.out.println(cuerpoCeleste.getNombre());
        }
        System.out.println();
        System.out.println("Todas los satelites de " + Luna.getNombre());
        Set<CuerpoCeleste>lunas=new HashSet<>();
        for(CuerpoCeleste luna:sistemasolar.values()){
            lunas.addAll(luna.getSatelites());
        }
        for(CuerpoCeleste luna:lunas){
            System.out.println(luna.getNombre());
        }
        System.out.println();
        CuerpoCeleste cuerpoCeleste=new Planeta("Pluton",884);
        sistemasolar.put(cuerpoCeleste.getNombre(),cuerpoCeleste);
        planetas.add(cuerpoCeleste);
        System.out.println(sistemasolar.toString());//Si le añadimos pluton como planeta,no lo hara porque ya esta declarado dentro de planetas
        CuerpoCeleste cuerpoCeleste1=new PlanetaEnano("Pluton",884);
        sistemasolar.put(cuerpoCeleste1.getNombre(),cuerpoCeleste1);
        planetas.add(cuerpoCeleste1);
        System.out.println(sistemasolar.toString());
        System.out.println();
        //Si le ponemos planeta enano si que te lo añade porque al ser otro tipo de planeta,lo añadira dentro de planetas
        System.out.println("Diferencia");
        Set<CuerpoCeleste>diferencia=new HashSet<>(planetas);
        diferencia.removeAll(sistemasolar.values());
        for(CuerpoCeleste cuerpoCeleste2:diferencia){
            System.out.println(cuerpoCeleste2.getNombre());
        }
        System.out.println();

        System.out.println("Interseccion");
        Set<CuerpoCeleste>Interseccion=new HashSet<>(planetas);
         Interseccion.retainAll(sistemasolar.values());
        for(CuerpoCeleste cuerpoCeleste3:Interseccion){
            System.out.println(cuerpoCeleste3.getNombre());
        }//En la diferencia elimina aquello en que estan en los dos set y en interseccion junta aquello que estan en los dos set
    }
    }

