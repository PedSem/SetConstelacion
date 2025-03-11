package SetConstelacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,CuerpoCeleste>sistemasolar=new HashMap<>();
    private static Set<CuerpoCeleste>planetas=new HashSet<>();

    public static void main(String[] args) {
        TipoCuerpoCeleste planeta=TipoCuerpoCeleste.PLANETA;
        TipoCuerpoCeleste luna=TipoCuerpoCeleste.LUNA;
        TipoCuerpoCeleste planetaenano=TipoCuerpoCeleste.PLANETA_ENANO;

        CuerpoCeleste Mercurio=new CuerpoCeleste("Mercurio",88,planeta);
        sistemasolar.put("Mercurio",Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus=new CuerpoCeleste("Venus",225,planeta);
        sistemasolar.put("Venus",Venus);
        planetas.add(Venus);

        CuerpoCeleste latierra=new CuerpoCeleste("La Tierra",365,planeta);
        sistemasolar.put("La Tierra",Venus);
        planetas.add(latierra);

        CuerpoCeleste Marte=new CuerpoCeleste("Marte",687,planeta);
        sistemasolar.put("Marte",Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter=new CuerpoCeleste("Jupiter",4332,planeta);
        sistemasolar.put("Jupiter",Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno=new CuerpoCeleste("Saturno",10759,planeta);
        sistemasolar.put("Saturno",Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano=new CuerpoCeleste("Urano",30660,planeta);
        sistemasolar.put("Urano",Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno=new CuerpoCeleste("Neptuno",165,planeta);
        sistemasolar.put("Neptuno",Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton=new CuerpoCeleste("Pluton",248,planeta);
        sistemasolar.put("Pluton",Pluton);
        planetas.add(Pluton);

        CuerpoCeleste Luna=new CuerpoCeleste("Luna",27,luna);
        sistemasolar.put("Luna",Luna);
        latierra.AddSatelite(Luna);

        CuerpoCeleste Deimos=new CuerpoCeleste("Deimos",1.3,luna);
        sistemasolar.put("Marte",Deimos);
        Marte.AddSatelite(Deimos);

        CuerpoCeleste Phobos=new CuerpoCeleste("Phobos",0.3,luna);
        sistemasolar.put("Marte",Phobos);
        Marte.AddSatelite(Phobos);

        CuerpoCeleste Io=new CuerpoCeleste("Io",1.8,luna);
        sistemasolar.put("Jupiter",Io);
        Jupiter.AddSatelite(Io);

        CuerpoCeleste Europa=new CuerpoCeleste("Europa",3.5,luna);
        sistemasolar.put("Jupiter",Europa);
        Jupiter.AddSatelite(Europa);

        CuerpoCeleste Ganymede=new CuerpoCeleste("Ganymede",7.1,luna);
        sistemasolar.put("Jupiter",Ganymede);
        Jupiter.AddSatelite(Ganymede);

        CuerpoCeleste Callisto=new CuerpoCeleste("Callisto",16.7,luna);
        sistemasolar.put("Jupiter",Callisto);
        Jupiter.AddSatelite(Callisto);
        System.out.println("Todos los planetas");
        for(CuerpoCeleste cuerpoCeleste:planetas){
            System.out.println(cuerpoCeleste);

        }
        System.out.println();
        System.out.println("Las lunas de " + Marte.getNombre());
        System.out.println(Marte.getSatelites());
        System.out.println();
        System.out.println("Todas las lunas");
        Set<CuerpoCeleste>lunas=new HashSet<>();
        lunas.add(Deimos);
        lunas.add(Phobos);
        lunas.add(Io);
        lunas.add(Europa);
        lunas.add(Ganymede);
        lunas.add(Callisto);
        lunas.add(Luna);
        for(CuerpoCeleste cuerpoCeleste:lunas){
                System.out.println(cuerpoCeleste);

            }
        System.out.println();
        CuerpoCeleste cuerpoCeleste=new CuerpoCeleste("Pluton",884,planetaenano);
        sistemasolar.put("Pluton",cuerpoCeleste);
        planetas.add(cuerpoCeleste);
        System.out.println("Todos los planetas");
        for(CuerpoCeleste cuerpoCeleste1:planetas){
            System.out.println(cuerpoCeleste1);
            //No te lo añade porque el nombre se ha repetido y en el set no se repiten los valores

        }
        //Si le ponemos planeta enano si que te lo añade porque al ser otro tipo de planeta pues lo ingcluye dentro del set
        Set<CuerpoCeleste>diferencia=new HashSet<>(planetas);
        diferencia.removeAll(lunas);
        System.out.println(diferencia);

        Set<CuerpoCeleste>Interseccion=new HashSet<>(planetas);
         Interseccion.retainAll(lunas);
            System.out.println(lunas);
            //En la diferencia elimina aquello en las lunas y en interseccion retiene lo de las lunas


    }




    }

