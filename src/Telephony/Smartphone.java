package Telephony;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements  Browsable, Callable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        String regex = "^(\\D)*$";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder browsedSites = new StringBuilder();
        for (String url : urls) {
            Matcher matcher = pattern.matcher(url);
            if (matcher.find()) {
                browsedSites.append("Browsing: " + url + "!").append(System.lineSeparator());
            }else {
                browsedSites.append("Invalid URL!").append(System.lineSeparator());
            }
        }
        return browsedSites.toString().trim();
    }

    @Override
    public String call() {
        String regex = "^([0-9]+$)";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder coledNumbers = new StringBuilder();
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.find()) {
                coledNumbers.append("Calling... " + number).append(System.lineSeparator());
            }else {
                coledNumbers.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return coledNumbers.toString().trim();
    }

}
