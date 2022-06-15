package bazzaev.runner;




import java.util.Arrays;
import java.util.List;


import static java.lang.Integer.MAX_VALUE;

public class Solution {
    private static final List <String> WORDS = Arrays.asList("S", "W", "T", "P");
    private static final List <String> RACES = Arrays.asList("human", "swamper", "woodman");

    public static Integer getResult(String playingField, String race) {
        if(playingField.length() != 16){
            throw new RuntimeException("Неверное количество символов");
        }
        for (int i = 0; i < playingField.length(); i++) {
            if(!WORDS.contains(String.valueOf(playingField.toUpperCase().charAt(i)))){
                throw new RuntimeException("Некорректно введенные данные");
            }
        }
        if(!RACES.contains(race.toLowerCase())){
            throw new RuntimeException("Некорректно введенна расса");
        }

        Integer[][] location = new Integer[4][4];
        Integer[][] dist = new Integer[16][16];
        int g = 0;
        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location.length; j++) {
                switch (race.toLowerCase()) {
                    case ("human") -> {
                        switch (String.valueOf(playingField.toUpperCase().charAt(g))) {
                            case "S" -> location[i][j] = 5;
                            case "W" -> location[i][j] = 2;
                            case "T" -> location[i][j] = 3;
                            case "P" -> location[i][j] = 1;
                        }
                        g++;
                    }
                    case ("swamper") -> {
                        switch (String.valueOf(playingField.toUpperCase().charAt(g))) {
                            case "S", "W", "P" -> location[i][j] = 2;
                            case "T" -> location[i][j] = 5;
                        }
                        g++;
                    }
                    case ("woodman") -> {
                        switch (String.valueOf(playingField.toUpperCase().charAt(g))) {
                            case "S", "W" -> location[i][j] = 3;
                            case "T", "P" -> location[i][j] = 2;
                        }
                        g++;
                    }
                }
            }
        }

        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location.length; j++) {
                dist[4 * i + j][4 * i + j] = 0;
                if (i > 0) {
                    dist[4 * (i - 1) + j][4 * i + j] = location[i][j];
                }
                if (j > 0) {
                    dist[4 * i + j - 1][4 * i + j] = location[i][j];
                }
                if (j < 3) {
                    dist[4 * i + (j + 1)][4 * i + j] = location[i][j];
                }
                if (i < 3) {
                    dist[4 * (i + 1) + j][4 * i + j] = location[i][j];
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                if (dist[i][j] == null) {
                    dist[i][j] = MAX_VALUE / 2;
                }
            }
        }
        for (int k = 0; k < dist.length; k++) {
            for (int i = 0; i < dist.length; i++) {
                for (int j = 0; j < dist.length; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
       return dist[0][15];
    }
}


