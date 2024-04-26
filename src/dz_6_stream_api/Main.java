//package org.example;
//
//import org.example.model.*;
//import org.example.util.Util;
//
//import java.io.IOException;
//import java.lang.reflect.Array;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.chrono.JapaneseDate;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static java.lang.Long.sum;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
////        task1();
////        task2();
////        task3();
////        task4();
////        task5();
////        task6();
////        task7();
////        task8();
////        task9();
////        task10();
////        task11();
////        task12();
////        task13();
////        task14();
////        task15();
//
//    }
//
//    private static void task1() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getAge() >= 10 && animal.getAge() <= 20)
//                .sorted(Comparator.comparingInt(Animal::getAge))
//                .skip(14).limit(7)
//                .forEach(System.out::println);
//    }
//
//    private static void task2() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getOrigin().equals("Japanese") && animal.getGender().equals("Female"))
//                .map(Animal::getBread)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//    }
//
//    private static void task3() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        animals.stream()
//                .filter(animal -> animal.getAge() > 30)
//                .filter(animal -> animal.getOrigin().startsWith("A"))
//                .map(Animal::getOrigin)
//                .distinct()
//                .forEach(System.out::println);
//    }
//
//    private static void task4() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        long count = animals.stream()
//                .filter(animal -> animal.getGender().equals("Female"))
//                .count();
//        System.out.println(count);
//    }
//
//    private static void task5() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        boolean match = animals.stream()
//                .filter(animal -> animal.getAge() >= 20 && animal.getAge() <= 30)
//                .anyMatch(animal -> animal.getOrigin().equals("Hungarian"));
//        System.out.println(match);
//    }
//
//    private static void task6() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        boolean allMatch = animals.stream()
//                .allMatch(animal -> animal.getGender().equals("Male") && animal.getGender().equals("Female"));
//        System.out.println(allMatch);
//    }
//
//    private static void task7() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        boolean noneMatch = animals.stream()
//                .noneMatch(animal -> animal.getOrigin().equals("Oceania"));
//        System.out.println(noneMatch);
//    }
//
//    private static void task8() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        long age = animals.stream()
//                .sorted(Comparator.comparing(Animal::getBread))
//                .limit(100)
//                .map(animal -> animal.getAge())
//                .max(Integer::compare).get();
//        System.out.println("Возраст самого старого: " + age);
//    }
//
//    private static void task9() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        int shortestArrayLength = animals.stream()
//                .map(animal -> animal.getBread())
//                .map(breadString -> breadString.toCharArray())
//                .mapToInt(arr->arr.length)
//                .min()
//                .getAsInt();
//    }
//
//    private static void task10() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        Integer sum = animals.stream()
//                .mapToInt(Animal::getAge)
//                .sum();
//        System.out.println(sum);
//
//    }
//
//    private static void task11() throws IOException {
//        List<Animal> animals = Util.getAnimals();
//        OptionalDouble average = animals.stream()
//                .filter(animal -> animal.getOrigin().equals("Indonesian"))
//                .mapToInt(Animal::getAge)
//                .average();
//        System.out.println(average);
//    }
//
//    private static void task12() throws IOException {
//        List<Person> people = Util.getPersons();
//        LocalDate today = LocalDate.now();
//        people.stream()
//                .filter(person->person.getGender().equals("Male"))
//                .filter(person -> {
//                    LocalDate bithday = person.getDateofBith();
//                    int age = Period.between(bithday, today).getYears();
//                    return age >= 18 && age <= 27;
//                })
//                .sorted(Comparator.comparing(Person::getRecruitmentGroup))
//                .limit(200)
//                .forEach(System.out::println);
//
//    }
//
//    private static void task13() throws IOException {
//        List<House> houses = Util.getHouses();
//    }
//
//    private static void task14() throws IOException {
//        List<Car> cars = Util.getCars();
//    }
//
//    private static void task15() throws IOException {
//        List<Flower> flowers = Util.getFlowers();
//        Comparator<Flower> flowerOrigComparatorRevers = (o1, o2) -> o2.getOrigin().compareTo(o1.getOrigin());
//        Comparator<Flower> flowerPriceComparator = (o1, o2) -> o2.getPrice();
//        Comparator<Flower> flowerWaterComparator = (o1, o2) -> (int) (o1.getWaterConsumptionPerDay() - o2.getWaterConsumptionPerDay());
//        int sum = flowers.stream()
//                .sorted(flowerOrigComparatorRevers
//                        .thenComparing(flowerPriceComparator).reversed()
//                        .thenComparing(flowerWaterComparator).reversed())
//                .filter(flower ->
//                        flower.getCommonName().charAt(0) >= 'C' &&
//                                flower.getCommonName().charAt(0) <= 'S')
//                .filter(flower -> flower.getFlowerVaseMaterial()
//                        .stream()
//                        .anyMatch(s -> "Steel".equals(s) ||
//                                "Glass".equals(s) || "Aluminum".equals(s)))
//                .mapToInt(flower -> flower.getPrice()).sum();
//        //частичное решение
//        System.out.println(sum);
//
//
//    }
//}