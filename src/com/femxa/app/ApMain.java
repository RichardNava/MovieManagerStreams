/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.femxa.app;

import com.femxa.db.DBConnect;
import com.femxa.inter.Inter1;
import com.femxa.inter.Inter2;
import com.femxa.models.Genre;
import com.femxa.models.Movie;
import com.femxa.utils.MovieManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ApMain {

    public static void main(String[] args) throws IOException, SQLException {

//        Inter1 in1 = (number, number2) -> System.out.println((float) (number * number2));
//        Inter1 in2 = (number, number2) -> System.out.println((float) (number - number2));
//        mShow(in1, 4, 10);
//        mShow(in2, 4, 10);
//
//        Inter2 in3 = (num,num2) -> (byte) (num + num2);
//        showCastMetodo(in3, (byte) 1250, (byte) 2313);
//
//        List<String> list = new ArrayList<>();
//        list.add("Romualdo");
//        list.add("Gervasio");
//        list.add("Gumersindo");
//
//        list.forEach((String name) -> System.out.println(name.toUpperCase()));
//        list.forEach((String name) -> System.out.println(name.startsWith("G")));
//
        List<Integer> list2 = new ArrayList<>(List.of(1, 1, 2, 3, 18, 3, 22, 51, 6, 18));
        list2.add(4); // 2 - 4-2 = +2
        list2.add(2); // 4 - 7 = -3
        list2.add(7); // 4 - 1 = +3
        list2.add(1);
//
//        list.sort((a, b) -> a.charAt(0) - b.charAt(0)); // b-a = 1-1 = +0
//        list.forEach(System.out::println);

//        for (String s : list) {
//            System.out.println(s.toUpperCase());
//        }
        Suavizante suav1 = new Suavizante("Vernel", Olor.CIELO_AZUL, 4.99);
        List<Suavizante> listSuavizantes = new ArrayList<>();
        listSuavizantes.add(suav1);
        listSuavizantes.add(new Suavizante("Flota", Olor.CIELO_AZUL, 2.75));
        listSuavizantes.add(new Suavizante("Mimosin", Olor.ROSAS, 4.15));
        listSuavizantes.add(new Suavizante("Conejo", Olor.MARSELLA, 3.45));
        listSuavizantes.add(new Suavizante("Vernel", Olor.ROSAS, 4.80));
        listSuavizantes.add(new Suavizante("Conejo", Olor.ROSAS, 3.55));
        listSuavizantes.add(new Suavizante("@Mimosin", Olor.CIELO_AZUL, 4.35));
        listSuavizantes.removeIf((Suavizante s) -> s.getOlor().name() == "MARSELLA"); // Predicate
//        listSuavizantes.forEach((Suavizante s)->System.out.println(s.toString())); // Consumer
//                  listSuavizantes.replaceAll((Suavizante s) -> {
//                      s.setName("Mercadona");
//                      return s;
//                          }); // UnaryOperator -> Function 2.0
        //listSuavizantes.forEach((Suavizante s)->System.out.println(s.toString())); // Consumer
        //System.out.println(n); 
        //          list2.stream()
        //               .distinct() // Método intermedio: elimina duplicados según tratamiento de equals()
        //               .forEach(System.out::println);
        //       Optional<Suavizante> opSuavizante = listSuavizantes.parallelStream()
        //.skip(1) // Método intermedio: salta n elementos del Stream siendo n el argumento que le pasamos
        //.distinct()
        //.findFirst()
        //                   .skip(1)
        //                   .limit(3)
        //            .filter((Suavizante s) -> s.getName().length() >= 16)
        //                .findAny();
        //               .min((Suavizante a, Suavizante b) -> a.getName().length() - b.getName().length());
        //.forEach(s -> System.out.println(s));
        //.noneMatch((Suavizante s)-> s.getName().equals("Vernel"));
        //String s = opSuavizante.isPresent() ? opSuavizante.get().toString() : "No se ha encontrado ninguna coincidencia";
        //System.out.println(opSuavizante.orElse(new Suavizante("Flota",Olor.MARSELLA)));
        //opSuavizante.ifPresent(s -> listSuavizantes.add(s));
        //        try {
        //            opSuavizante.orElseThrow(() -> new NullPointerException());
        //        } catch (NullPointerException e) {
        //            System.out.println("No hay nada con ese criterio de busqueda.");
        //        }
        //        opSuavizante.stream().forEach(System.out::println);
        //        Stream<String> names = Stream.of("Juan","Ana","Maria");
        //        Stream<String> namesUpperCase = names.map(name -> name.toUpperCase());
        //        namesUpperCase.forEach(System.out::println);
        //        listSuavizantes.stream()
        //                    .map(suav -> {
        //                        suav.setName(suav.getName().toUpperCase());
        //                        return suav.getName();
        //                    })
        //                    .forEach(System.out::println);
        //        int indiceTotal = listSuavizantes.stream()
        //                .mapToInt((Suavizante s) -> {
        //                    return  s.getOlor().ordinal();
        //                })
        //                .sum();
        //        System.out.println(indiceTotal);
        //         OptionalDouble totalPrize = listSuavizantes.stream()
        //                 .mapToDouble(s -> s.getPrize())
        //                 //.filter(s -> s>4)
        //                 .min();
        //         System.out.println(totalPrize.getAsDouble());
        //         List<List<String>> nameList = Arrays.asList(Arrays.asList("Juan","Maria","Daniel"),
        //                                                     Arrays.asList("Monica","Eva","Diego"));
        //         long countC = nameList.stream().flatMap((List<String> l) -> l.stream())
        //                 .filter(nombre -> nombre.length()>4)
        //                 .count();
        //         System.out.println(countC);

//        listSuavizantes.stream()
//                .peek(suavi -> suavi.setPrize(suavi.getPrize()*1.10))
//                .filter(suavi -> suavi.getPrize()>=4.5)
//                .forEach(System.out::println);
//         System.out.println("Total: "+list2.stream()
//                                 .filter(n -> n%2==0)
//                                 .peek(n -> System.out.println("par: "+ n))
//                                 .count());       
//        listSuavizantes.stream()
//                .sorted(Comparator.comparing(suavi -> suavi.getPrize()))
//                .forEach(System.out::println);
//        Optional<Integer> opNums = list2.stream()
//                .distinct()
//                .reduce((num1, num2) -> num1 + num2);
//        
//        OptionalDouble opNums2 = list2.stream()
//                .distinct()
//                .mapToInt(n->n)
//                .average();
//        
//        System.out.println(opNums.get()+" "+opNums2.getAsDouble());
//        Comparator
//                   list2.stream()
//                       .distinct()
//                       .filter(n -> n%2==0)
//                       .sorted((a,b) -> a-b) 
////                       .limit(3) // 2 18 22
////                       .reduce((a,b)-> a+b)
////                       .get()
////                       .mapToInt(n->n)
////                       .sum()
//               .forEach(System.out::println);
        //      System.out.println(num);
//        
//        list2.sort((a,b)->a-b); //algoritmo burbuja
//        //Set<Integer> set2 = new TreeSet<>(list2);
//        List<Integer> list3 = new ArrayList<>();
//        int sum = 0;
//        int count = 0;
//        for (Integer n : list2) {
//            if(!list3.contains(n) && n%2==0){
//                sum +=n;
//                count++;
//                if(count==3) break;
//            }
//            list3.add(n);
//        }
//        System.out.println(sum);
//       list2 = list2.stream()
//       // int num = list2.stream()
//                       .distinct()
//                       .filter(n -> n%2==0)
//                       .sorted()
//                       .limit(4) // 2 18 22
//                       .collect(Collectors.toList())
//                       .stream()
//                       .mapToInt(n->n+10)
//                       .max()
//                       .getAsInt();
//
        //list2.stream().forEach(System.out::println);
        //System.out.println(num);
//        Map<Double,Suavizante> mapSuavizantes = listSuavizantes.stream()
//                      .collect(Collectors.toMap(s -> s.getPrize(), s -> s));
//
        Map<Boolean, List<Suavizante>> mapSuavizantes = listSuavizantes
                .stream()
                .collect(Collectors.partitioningBy(s -> s.getPrize() > 4));
//        String olor = "MARSELLA";
//        
//        String text = listSuavizantes
//                .stream()
//                .filter(s-> !s.getOlor().name().equals(olor))
//                .map(s -> s.toString())
//                .collect(Collectors.joining("\n"));
//        System.out.println(text);
//        for (Boolean key : mapSuavizantes.keySet()) {
//            System.out.println("Clave: "+key+" valor: "+mapSuavizantes.get(key));
//        }

//          list2.stream()
//               .map((Integer i) -> i*10)
//               .forEach( (n) -> System.out.println("Número: ") );
        MovieManager mm = new MovieManager();
        DBConnect dbconn = new DBConnect();
//        mm.insertMovieData();
//        //mm.findByGenre(Genre.TERROR).forEach(System.out::println);
//        mm.averageRatingMovies(mm.findByGenre(Genre.TERROR));
//        mm.tablaPremios().forEach((k,v)->{ 
//            System.out.println("Grupo Premios= "+k);
//            v.forEach(m->{
//                System.out.println("\t"+m.getTitle());
//                System.out.println("\t\t"+m.getDirector()+"\n\t\t"+m.getYear()+"\n\t\t"+m.getRating());    
//                    });
//        });
//        System.out.println(mm.charsWhitReferenceMethod());
          mm.FibonacciSequence(new ArrayList<>(Arrays.asList(0)),10).forEach(System.out::println);
    }

    public static void mShow(Inter1 in1, int number, int number2) {
        in1.metodo(number, number2);
    }

    public static void showCastMetodo(Inter2 in1, byte number, byte number2) {
        System.out.println(in1.castMetod(number, number2));
    }

}

class Suavizante {

    private String name;
    private Olor olor;
    private double prize;

    public Suavizante(String name, Olor olor, double prize) {
        this.name = name;
        this.olor = olor;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Olor getOlor() {
        return olor;
    }

    public void setOlor(Olor olor) {
        this.olor = olor;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Suavizante{" + "name= " + name + ", olor= " + olor + ", precio= " + prize + '}';
    }

}

enum Olor {
    MARSELLA,
    CIELO_AZUL,
    ROSAS;

}
