public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number) {
        this.id = id;
        this.number = number;
    }

    public String toString() {
        return this.id + ":" + this.number;
    }

    public static boolean validate(String number) {
        char[] letra = number.toCharArray();
        boolean[] retorno = new boolean[letra.length];
        int i = 0;
        boolean retornoFinal = true;

        while (i < letra.length) {
            switch (letra[i]) {
                case '0':
                retorno[i] = true;
                break;
                case '1':
                retorno[i] = true;
                break;
                case '2':
                retorno[i] = true;
                break;
                case '3':
                retorno[i] = true;
                break;
                case '4':
                retorno[i] = true;
                break;
                case '5':
                retorno[i] = true;
                break;
                case '6':
                retorno[i] = true;
                break;
                case '7':
                retorno[i] = true;
                break;
                case '8':
                retorno[i] = true;
                break;
                case '9':
                retorno[i] = true;
                break;
                case '(':
                retorno[i] = true;
                break;
                case ')':
                retorno[i] = true;
                break;
                default:
                if (letra[i] == '.') {
                    retorno[i] = true;
                } else {
                   retorno[i] = false; 
                }
            }
            i++;
        }
        
        for (i = 0; i < retorno.length; i++) {
            if (retorno[i] != true) {
                retornoFinal = false;
            } 
        }

        return retornoFinal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public boolean isValid() {
        if (validate(this.getNumber())) {
            return true;
        } else {
            return false;
        }
    }

}
