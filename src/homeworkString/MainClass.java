package homeworkString;

import java.util.ArrayList;

public class MainClass {


    public static void main(String[] args) {
        String text =
                "1. В цифровой форме число заметнее. По наблюдениям психологов, «первоклассники не замечают в условии" +
                        " задачи арифметическое данное, если оно обозначено словесно, а не в виде цифры, к чему они привыкли»" +
                        " (Богоявленский Д. Н. Психология усвоения знаний в школе / Д. Н. Богоявленский, Н. А. Менчинская. М." +
                        ", 1959. С. 169).\n" +
                        "2. В цифровой форме дву- и многозначные числа схватываются читателем намного быстрее? Они, по-видимо" +
                        "му, не прочитываются, не переводятся мысленно в словесную форму, а именно схватываются взглядом, что" +
                        " упрощает и ускоряет восприятие текста?\n" +
                        "3. Однозначные числа в косвенных падежах в цифровой форме несколько усложняют чтение. Скорее всего, " +
                        "потому, что все же прочитываются в именительном падеже (после 4 заседаний — «после четыре заседаний»" +
                        "). Но потребность согласовать с падежом существительного вынуждает вернуться к числительному и прочи" +
                        "тать его правильно: четырех заседаний. На это уходит время, а при словесной форме числительное сразу" +
                        " читается правильно.";
        System.out.println(text);
        String textOut;

        textOut = runTask1(text);
        System.out.println(textOut);

        int counter = runTask2(text);
        System.out.println("Количество знаков препинания " + counter);

        counter = runTask3(text);
        System.out.println("Сумма " + counter);

        int position = 6;
        char symbol = 'А';
        textOut = runTask4(text, position, symbol);
        System.out.println("Заменить " + position + " букву на " + symbol);
        System.out.println(textOut);

        textOut = runTask5(text, '(', ')');
        System.out.println(textOut);

        runTask6(text);

        runTask7(text);

        runTask8(text, 1);
        runTask8(text, 2);


    }

    private static String runTask1(String text) {
        System.out.println("------------------------------------");
        System.out.println("1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.");

        StringBuilder strB;
        strB = new StringBuilder();

        String[] sentences = text.split("\\n+");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String s : words) {
                if (s.charAt(0) == '(' || s.charAt(0) == '«') {
                    strB.append(s.charAt(0))
                            .append((s.charAt(1) + "").toUpperCase())
                            .append(s.substring(2)).append(" ");
                } else {
                    strB.append((s.charAt(0) + "").toUpperCase())
                            .append(s.substring(1))
                            .append(" ");
                }
            }
            strB.append("\n");
        }
        return strB.toString();
    }

    private static int runTask2(String text) {
        System.out.println("------------------------------------");
        System.out.println("2. Подсчитать количество содержащихся в данном тексте знаков препинания");

        int resultInt = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.'
                    || text.charAt(i) == ','
                    || text.charAt(i) == '!'
                    || text.charAt(i) == ':'
                    || text.charAt(i) == ';'
                    || text.charAt(i) == '—'
                    || text.charAt(i) == '?'
            ) {
                resultInt++;
            }
        }

        return resultInt;
    }

    private static int runTask3(String text) {
        System.out.println("------------------------------------");
        System.out.println("3.  Определить сумму всех целых чисел, встречающихся в заданном тексте");
        int resultInt = 0;
        // "\D" - нецифровой символ
        String[] words = text.split("\\D+");
        for (String s : words) {
            System.out.println(s);
            resultInt += Integer.parseInt(s);
        }
        return resultInt;
    }

    private static String replaceSymbolByPosition(String word, int position, char symbol) {
        StringBuilder strB;
        strB = new StringBuilder();
        if (word.charAt(0) == '(' || word.charAt(0) == '«') {
            if (word.length() >= position + 1) {
                return strB.append(word.substring(0, position))
                        .append(symbol)
                        .append(word.substring(position + 1))
                        .append(" ")
                        .toString();
            } else {
                return strB.append(word)
                        .append(" ")
                        .toString();
            }

        } else {
            if (word.length() >= position) {
                return strB.append(word.substring(0, position - 1))
                        .append(symbol)
                        .append(word.substring(position))
                        .append(" ")
                        .toString();
            } else {
                return strB.append(word)
                        .append(" ")
                        .toString();
            }
        }
    }

    private static String runTask4(String text, int position, char symbol) {
        System.out.println("------------------------------------");
        System.out.println("4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины сло" +
                "ва, корректировку не выполнять.");

        StringBuilder strB;
        strB = new StringBuilder();

        String[] sentences = text.split("\\n+");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String s : words) {
                strB.append(replaceSymbolByPosition(s, position, symbol));
            }
            strB.append("\n");
        }

        return strB.toString();
    }

    private static String runTask5(String text, char firstSymbol, char secondSymbol) {
        System.out.println("------------------------------------");
        System.out.println("5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (на" +
                "пример, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == firstSymbol
            ) {
                for (int j = i; j < text.length(); j++) {
                    if (text.charAt(j) == secondSymbol
                    ) {
                        text = text.substring(0, i) + text.substring(j + 1);
                        break;
                    }
                }
            }
        }

        return text;
    }


    private static void runTask6(String text) {
        System.out.println("------------------------------------");
        System.out.println("6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречае" +
                "тся в нем.");

        String[] words = text.replaceAll("[!-?«-»—]+", "").split("\\s+");
        ArrayList<String> wordsOut = new ArrayList<>();


        for (int i = 1; i < words.length; i++) {
            checkWordMatch(words, i, words[i], wordsOut);
        }

    }

    private static void runTask7(String text) {
        System.out.println("------------------------------------");
        System.out.println("7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста");
        text = runTask5(text, '(', ')');
        int vowelsCount;
        int consonantsCount;
        text = text.replaceAll("1.|2.|3.+", "").replace('\n', ' ');

        String[] sentences = text.split("[.!?]+");
        for (String sentence : sentences) {
            System.out.println(sentence);
            sentence = sentence.replaceAll("\\s+", "").replaceAll("[!-?«-»—]+", "").toLowerCase();
            vowelsCount = 0;
            consonantsCount = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if ((sentence.charAt(i) + "").matches("[уеыаоэяию]")) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
            System.out.println(vowelsCount + " гласных, " + consonantsCount + " согласных");
            if (vowelsCount > consonantsCount) {
                System.out.println("гласных больше");
            }
            if (vowelsCount < consonantsCount) {
                System.out.println("согласных больше");
            }
            if (vowelsCount == consonantsCount) {
                System.out.println("согласных и гласных одинаково");
            }
        }

    }

    private static void checkWordMatch(String[] words, int i, String word, ArrayList<String> wordsOut) {

        int counter = 0;
        for (String s : wordsOut) {
            if (word.replaceAll("[!-?«-»—]+", "").equalsIgnoreCase(s)) {
                counter++;
            }

        }
        if (counter == 0) {
            counter = 1;

            for (int j = 0; j < words.length; j++) {
                if (j != i && word.replaceAll("[!-?«-»—]+", "").equalsIgnoreCase(words[j].replaceAll("[!-?«-»—]+", ""))) {
                    counter++;
                }
            }
            wordsOut.add(word
                    .replaceAll("[!-?«-»—]+", "")
                    .toUpperCase());
            System.out.println(counter + " \t " + word.toUpperCase());
        }

    }

    private static void runTask8(String text, int length) {
        System.out.println("------------------------------------");
        System.out.println("8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова з" +
                "аданной длины");
        StringBuilder strB;
        strB = new StringBuilder();

// Находим вопросительные предложения
        for (int j = 0; j < text.length() && j != -1; j++) {
            for (int i = text.indexOf('?', j) - 1; i >= 0; i--) {
                if (text.charAt(i) == '.' || text.charAt(i) == '?') {
                    j = text.indexOf('?', j) + 1;
                    strB.append(text.substring(i + 1, j));
                    break;
                }
            }
        }


        System.out.println(strB.toString());

        String[] words = strB.toString().replaceAll("[!-?«-»—]+", "").split("\\s+");
        ArrayList<String> wordsOut = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == length) {
                checkWordMatch(words, i, words[i], wordsOut);
            }
        }
    }


}
