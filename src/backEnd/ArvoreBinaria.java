package backEnd;

import java.util.Random;

public class ArvoreBinaria {

    public static Random r = new Random();
    public Dica raiz = null;
    public String Tema;

    public ArvoreBinaria(String tema) {
        this.Tema = tema;
    }

    public void inserir(String[] pos, String ladoaInserir, String conteudoDica, String animal) {
        Dica novaDica = new Dica(conteudoDica, animal);

        if (this.raiz == null) {
            this.raiz = novaDica;
            return;
        }

        switch (ladoaInserir) {
            case "dir":
                posInserir(this.raiz, pos, 0).dir = novaDica;
                break;
            case "esq":
                posInserir(this.raiz, pos, 0).esq = novaDica;
                break;
        }
    }

    public Dica posInserir(Dica no, String[] pos, int i) {
        if (i == pos.length) {
            return no;
        }
        switch (pos[i]) {
            case "dir":
                return posInserir(no.dir, pos, i + 1);
            case "esq":
                return posInserir(no.esq, pos, i + 1);
            default:
                return null;
        }
    }

    public String caminhoAleatorio(String[] dicas) //Retorna uma String com a resposta e preenche um array passado em parametro com todas as dicas para essa resposta.
    {
        Dica temp = new Dica(null, null);
        String resposta = "teste";
        temp = this.raiz;
        int i = 0;

        while (temp != null) {
            if (r.nextInt(500) % 2 == 0) {
                resposta = temp.resposta;
                dicas[i] = temp.conteudo;
                temp = temp.dir;
            } else {
                resposta = temp.resposta;
                dicas[i] = temp.conteudo;
                temp = temp.esq;
            }
            i++;
        }
        return resposta;
    }
}

class Dica {

    public String conteudo;
    public String resposta;
    public Dica dir = null, esq = null;

    public Dica(String conteudo, String animal) {
        this.conteudo = conteudo;
        this.resposta = animal;
    }
}
