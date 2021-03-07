package z00;

import java.util.Random;

public class Zadanie4 {

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random random = new Random();

        if (n < 1 || n > 100) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < n; i++) {
            tab[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }

    }

    public static int ileNieparzystych(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j % 2 != 0) {
                output++;
            }
        }
        return output;
    }

    public static int ileParzystych(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j % 2 == 0) {
                output++;
            }
        }
        return output;
    }

    public static int ileDodatnich(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j > 0) {
                output++;
            }
        }
        return output;
    }

    public static int ileUjemnych(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j < 0) {
                output++;
            }
        }
        return output;
    }

    public static int ileZerowych(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j == 0) {
                output++;
            }
        }
        return output;
    }

    public static int ileMaksymalnych(int[] tab) {
        int maksymalna = tab[0];
        int iloscMaksymalnych = 1;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > maksymalna) {
                iloscMaksymalnych = 1;
                maksymalna = tab[i];
            } else if (tab[i] == maksymalna) {
                iloscMaksymalnych++;
            }
        }
        return iloscMaksymalnych;
    }

    public static int sumaDodatnich(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j > 0) {
                output += j;
            }
        }
        return output;
    }

    public static int sumaUjemnych(int[] tab) {
        int output = 0;
        for (int j : tab) {
            if (j < 0) {
                output += j;
            }
        }
        return output;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int dlugoscDodatniegoFragmentu = 0;
        int maxDlugoscDodatniegoFragmentu = 0;

        for (int j : tab) {
            if (j > 0) {
                dlugoscDodatniegoFragmentu++;
                if (dlugoscDodatniegoFragmentu > maxDlugoscDodatniegoFragmentu) {
                    maxDlugoscDodatniegoFragmentu = dlugoscDodatniegoFragmentu;
                }
            } else {
                dlugoscDodatniegoFragmentu = 0;
            }
        }
        return maxDlugoscDodatniegoFragmentu;
    }

    public static void signum(int[] tab) {
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] > 0) {
                tab[j] = 1;
            } else if (tab[j] < 0) {
                tab[j] = -1;
            }
        }
    }

    public static void signum(int[] tab, int lewy, int prawy) {
        int tmp;

        if (lewy < 1 || prawy < 1 || lewy > tab.length || prawy > tab.length) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < (prawy - lewy) / 2; i++) {
            tmp = tab[i];
            tab[lewy - 1 + i] = tab[prawy - 1 - i];
            tab[prawy - 1 - i] = tmp;
        }
    }

}
