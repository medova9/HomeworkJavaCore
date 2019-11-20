package streamsHomework;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;


public class CopyFile {
    private static Random random = new Random();

    public static void main(String[] args) throws IOException {
        runTask1();
        runTask2();
        runTask3();
    }

    private static void runTask1() throws IOException {
        //Создать и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
//По итогу получить файл с отсортированным массивом чисел
        File file1 = new File("task1.txt");
        try (FileOutputStream out = new FileOutputStream(file1)) {
            int c;


            for (int i = 0; i < 1000; i++) {
                c = random.nextInt(57);
                if (c >= 48)
                    out.write(c);
            }
        }


        List<Integer> arrayList = new ArrayList<>();
        try (FileInputStream is = new FileInputStream(file1)) {
            int b;
            while ((b = is.read()) != -1) {
                arrayList.add(b);
            }
        }
        arrayList.sort(Integer::compareTo);

        try (FileOutputStream out = new FileOutputStream(file1)) {


            for (Integer integer : arrayList) {
                out.write(integer);
            }
        }
    }

    private static void runTask2() throws IOException {
        //Прочитать строки из файла и поменять местами первое и последнее слова в каждой строк.
        File file2 = new File("task2.txt");
        try (PrintWriter out = new PrintWriter(file2)) {
            out.println("На полянке у тропинки");
            out.println("Пробиваются травинки");
            out.println("С бугорка ручей бежит");
            out.println("А под ёлкой снег лежит");
        }
        try (FileReader fileReader = new FileReader(file2);
             BufferedReader in = new BufferedReader(fileReader)) {

            String str;
            while ((str = in.readLine()) != null) {
                LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(str.split(" ")));

                String buf = linkedList.getFirst();
                linkedList.removeFirst();
                linkedList.addFirst(linkedList.getLast());
                linkedList.removeLast();
                linkedList.addLast(buf);

                StringBuilder strB;
                strB = new StringBuilder();
                for (String s : linkedList) {
                    strB.append(s)
                            .append(" ");
                }
                str = strB.toString().trim();
                System.out.println(str);
            }
        }
    }

    private static void runTask3() throws IOException {
        //Разместить в файле любой текст, разбить его на абзацы, предложения, слова, вывести статистику по тексту.
//Ко всему этому использовать паттерн Chain of Responsibilities.
        File file3 = new File("task3.txt");
        String str = "В Java для описания работы по вводу/выводу используется специальное понятие " +
                "поток данных (stream).\n" +
                "Поток данных связан с некоторым источником или приемником данных, " +
                "способных получать или предоставлять информацию. " +
                "Соответственно, потоки делятся на входные читающие данные, и на " +
                "выходные передающие (записывающие) данные.\n" +
                "Введение концепции stream позволяет отделить программу, обменивающуюся " +
                "информацией одинаковым образом с любыми устройствами, от низкоуровневых " +
                "операций с такими устройствами ввода/вывода.\n" +
                "Потоки данных это упорядоченные последовательности данных, которым " +
                "соответствует определенный источник (source) (для потоков ввода) или получатель " +
                "(destination) (для потоков вывода).\n" +
                "Классы ввода-вывода Java исключают необходимость вникать в особенности " +
                "низкоуровневой организации операционных систем и предоставляют доступ к " +
                "системным ресурсам посредством методов работы с файлами и иных инструментов.";
        try (PrintWriter out = new PrintWriter(file3)) {
            out.print(str);
        }


        StringBuilder strB;
        strB = new StringBuilder();
        String s;
        try (FileReader fileReader = new FileReader(file3);
             BufferedReader in = new BufferedReader(fileReader)) {
            while ((s = in.readLine()) != null) {
                strB.append(s)
                        .append("\n");
            }
        }
        System.out.println(strB.toString());
        if (!strB.toString().equals("")) {

            Text text;
            text = new Text();
            text.setCheck(
                    new WordCheck(text).addCheck(
                            new SentenceCheck(text).addCheck(
                                    new ParagraphCheck(text).addCheck(
                                            new DefaultCheck(text)
                                    )
                            )
                    )
            );
            Structure structure = new Structure();
            for (char c : str.toCharArray()) {
                structure = text.checker(structure, c);
            }
            System.out.println(structure);
        }
    }
}

class Structure {
    private int paragraphs = 0;
    private int sentences = 0;
    private int words = 0;

    public int getParagraphs() {
        return paragraphs;
    }

    public void increaseParagraphs() {
        this.paragraphs++;
    }

    public int getSentences() {
        return sentences;
    }

    public void increaseSentences() {
        this.sentences++;
    }

    public int getWords() {
        return words;
    }

    public void increaseWords() {
        this.words++;
    }

    @Override
    public String toString() {
        return "Structure{" +
                "paragraphs=" + paragraphs +
                ", sentences=" + sentences +
                ", words=" + words +
                '}';
    }
}

// Интерфейс обработчиков.
interface TextCheck {
    Structure check(Structure str, Character symbol);
}

class DefaultCheck implements TextCheck {
    private DefaultCheck check;

    DefaultCheck(Text text) {
    }

    DefaultCheck addCheck(DefaultCheck check) {
        this.check = check;
        return this;
    }

    @Override
    public Structure check(Structure str, Character symbol) {
        if (check != null) {
            return check.check(str, symbol);
        } else {
            return str;
        }
    }
}

class ParagraphCheck extends DefaultCheck implements TextCheck {
    ParagraphCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("\n")) {
            structure.increaseParagraphs();
        }
        return super.check(structure, symbol);
    }
}

class SentenceCheck extends DefaultCheck implements TextCheck {
    SentenceCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("[!?.]")) {
            structure.increaseSentences();
        }
        return super.check(structure, symbol);
    }
}

class WordCheck extends DefaultCheck implements TextCheck {
    WordCheck(Text text) {
        super(text);
    }

    @Override
    public Structure check(Structure structure, Character symbol) {
        String s = symbol.toString();
        if (s.matches("[ \n]")) {
            structure.increaseWords();
        }
        return super.check(structure, symbol);
    }
}

class Text {
    protected Structure structure;
    protected Character symbol;
    private DefaultCheck check;

    Text() {
    }

    void setCheck(DefaultCheck check) {
        this.check = check;
    }

    Structure checker(Structure structure, Character symbol) {
        return check.check(structure, symbol);
    }
}