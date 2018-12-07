package backEnd;

import java.util.ArrayList;

public class ProjetoFinalLEDA {

    public ArvoreBinaria transporte() {

        //Árvore de Transporte.
        ArvoreBinaria transporte = new ArvoreBinaria("Meios de Transporte");

        transporte.inserir(new String[]{}, " ", "É meio de transporte.", "");

        //elementos da esquerda
        transporte.inserir(new String[]{}, "esq", "É terrestre.", "");

        transporte.inserir(new String[]{"esq"}, "dir", "Não é tão popular.", "");
        transporte.inserir(new String[]{"esq"}, "esq", "É popular.", "");

        transporte.inserir(new String[]{"esq", "esq"}, "dir", "É usado para serviços pesados.", "");
        transporte.inserir(new String[]{"esq", "esq"}, "esq", "Muito encontrado em áreas urbanas.", "");

        transporte.inserir(new String[]{"esq", "esq", "esq"}, "dir", "Necessita de equilíbrio para pilotar.", "MOTO");
        transporte.inserir(new String[]{"esq", "esq", "esq"}, "esq", "Suporta até 4 pessoas.", "CARRO");

        transporte.inserir(new String[]{"esq", "esq", "dir"}, "dir", "Usado para cavar terra.", "TRATOR");
        transporte.inserir(new String[]{"esq", "esq", "dir"}, "esq", "Transporta carga.", "CAMINHAO");

        transporte.inserir(new String[]{"esq", "dir"}, "dir", "Animais são usados como tração.", "");
        transporte.inserir(new String[]{"esq", "dir"}, "esq", "É ferroviário.", "");

        transporte.inserir(new String[]{"esq", "dir", "esq"}, "dir", "Usado em grandes cidades por trabalhadores.", "METRO");
        transporte.inserir(new String[]{"esq", "dir", "esq"}, "esq", "Os mais antigos usam madeira como combustível", "LOCOMOTIVA");

        transporte.inserir(new String[]{"esq", "dir", "dir"}, "dir", "Usado principalmente em desertos.", "CAMELO");
        transporte.inserir(new String[]{"esq", "dir", "dir"}, "esq", "Geralmente usa cavalo ou burro.", "CARROCA");

        //elementos da direita
        transporte.inserir(new String[]{}, "dir", "É aéreo.", "");

        transporte.inserir(new String[]{"dir"}, "dir", "Utiliza querosene.", "");
        transporte.inserir(new String[]{"dir"}, "esq", "Não utiliza motores.", "");

        transporte.inserir(new String[]{"dir", "dir"}, "dir", "É usado comercialmente.", "");
        transporte.inserir(new String[]{"dir", "dir"}, "esq", "Rompe a barreira do som.", "");

        transporte.inserir(new String[]{"dir", "esq"}, "dir", "É ecológico.", "");
        transporte.inserir(new String[]{"dir", "esq"}, "esq", "Usa gás ou ar quente para se moverem.", "");

        transporte.inserir(new String[]{"dir", "esq", "esq"}, "dir", "É flutuante mas tem mecanismos de direção.", "DIRIGIVEL");
        transporte.inserir(new String[]{"dir", "esq", "esq"}, "esq", "Causa acidentes com incêndio.", "BALAO");

        transporte.inserir(new String[]{"dir", "esq", "dir"}, "dir", "Usado no pão de açucar no Rio de Janeiro.", "TELEFERICO");
        transporte.inserir(new String[]{"dir", "esq", "dir"}, "esq", "Utiliza uma vela de pano para planar.", "ASA DELTA");

        transporte.inserir(new String[]{"dir", "dir", "dir"}, "dir", "Quando cai morre (quase) todo mundo.", "AVIAO");
        transporte.inserir(new String[]{"dir", "dir", "dir"}, "esq", "Decola na vertical.", "HELICOPTERO");

        transporte.inserir(new String[]{"dir", "dir", "esq"}, "dir", "Usado no meio militar.", "CACA");
        transporte.inserir(new String[]{"dir", "dir", "esq"}, "esq", "Utilizado pela NASA.", "FOGUETE");

        return transporte;
    }

    public ArvoreBinaria profissao() {
        //Árvore profissão.
        ArvoreBinaria profissao = new ArvoreBinaria("Profissão");

        profissao.inserir(new String[]{}, " ", "É uma profissão", "");
        profissao.inserir(new String[]{}, "esq", "É da área de exatas", "");
        profissao.inserir(new String[]{}, "dir", "É da área de humanas", "");
        //agora vai pra sub arvore a ESQUERDA
        profissao.inserir(new String[]{"esq"}, "esq", "É da área de tecnologia", "");
        profissao.inserir(new String[]{"esq"}, "dir", "É da área civil", "");
        //==============================================================
        profissao.inserir(new String[]{"esq", "esq"}, "esq", "É um desenvolvedor", "");
        profissao.inserir(new String[]{"esq", "esq"}, "dir", "É uma profissão de risco", "");
        profissao.inserir(new String[]{"esq", "dir"}, "esq", "Trabalha com estruturas", "");
        profissao.inserir(new String[]{"esq", "dir"}, "dir", "Vive de cálculos", "");
        //===============================================================
        profissao.inserir(new String[]{"esq", "esq", "esq"}, "esq", "Escreve linhas de código", "PROGRAMADOR");
        profissao.inserir(new String[]{"esq", "esq", "esq"}, "dir", "Trabalha com imagens", "DESIGN");
        profissao.inserir(new String[]{"esq", "esq", "dir"}, "esq", "Mexe com cabos", "ELETRICISTA");
        profissao.inserir(new String[]{"esq", "esq", "dir"}, "dir", "Trabalha fora da terra", "ASTRONAUTA");
        //=================================================================
        profissao.inserir(new String[]{"esq", "dir", "esq"}, "esq", "Deixa sua casa mais bela", "ARQUITETO");
        profissao.inserir(new String[]{"esq", "dir", "esq"}, "dir", "Constrõe prédios e estradas", "ENGENHEIRO CIVIL");
        profissao.inserir(new String[]{"esq", "dir", "dir"}, "esq", "Constrõe formulas", "MATEMATICO");
        profissao.inserir(new String[]{"esq", "dir", "dir"}, "dir", "Ajuda na previsão do tempo", "ESTATISTICO");
        //==========================================================================
        //agora vai pra sub arvore a DIREITA
        profissao.inserir(new String[]{"dir"}, "esq", "Trabalha com saúde", "");
        profissao.inserir(new String[]{"dir"}, "dir", "Pode trabalhar sozinho", "");
        //====================================================================
        profissao.inserir(new String[]{"dir", "esq"}, "esq", "Estuda seu corpo", "");
        profissao.inserir(new String[]{"dir", "esq"}, "dir", "Estuda sua cabeça", "");
        profissao.inserir(new String[]{"dir", "dir"}, "esq", "Realiza cálculos", "");
        profissao.inserir(new String[]{"dir", "dir"}, "dir", "Estuda lugares", "");
        //===============================================================
        profissao.inserir(new String[]{"dir", "esq", "esq"}, "esq", "Médico da criança", "PEDIATRA");
        profissao.inserir(new String[]{"dir", "esq", "esq"}, "dir", "Médico da pele", "DERMATOLOGISTA");
        profissao.inserir(new String[]{"dir", "esq", "dir"}, "esq", "Médico do cérebro", "NEUROLOGISTA");
        profissao.inserir(new String[]{"dir", "esq", "dir"}, "dir", "Médico dos olhos", "OFTALMOLOGISTA");
        //=================================================================
        profissao.inserir(new String[]{"dir", "dir", "esq"}, "esq", "Faz o balanço final de uma empresa", "CONTADOR");
        profissao.inserir(new String[]{"dir", "dir", "esq"}, "dir", "Envolvido em tudo de uma empresa", "ADMINISTRADOR");
        profissao.inserir(new String[]{"dir", "dir", "dir"}, "esq", "Estuda o terreno", "GEOGRAFO");
        profissao.inserir(new String[]{"dir", "dir", "dir"}, "dir", "Estuda sociedades e culturas", "ARQUEOLOGO");
        //==========================================================================
        return profissao;
    }

    public ArvoreBinaria alimento() {
        //Árvore de alimentos.
        ArvoreBinaria alimento = new ArvoreBinaria("Alimentos");

        alimento.inserir(new String[]{}, " ", "É um alimento.", "");

        //elementos da esquerda
        alimento.inserir(new String[]{}, "esq", "É rico em carboidratos.", "");

        alimento.inserir(new String[]{"esq"}, "dir", "Pessoas saudáveis consomem.", "");
        alimento.inserir(new String[]{"esq"}, "esq", "É consumido geralmente no café da manhã.", "");

        alimento.inserir(new String[]{"esq", "esq"}, "dir", "É um tipo de massa.", "");
        alimento.inserir(new String[]{"esq", "esq"}, "esq", "É uma fruta.", "");

        alimento.inserir(new String[]{"esq", "esq", "esq"}, "dir", "Antes de comer se tira as sementes.", "MAMAO");
        alimento.inserir(new String[]{"esq", "esq", "esq"}, "esq", "É amarela.", "BANANA");

        alimento.inserir(new String[]{"esq", "esq", "dir"}, "dir", "Geralmente parte uma fatia para comer.", "BOLO");
        alimento.inserir(new String[]{"esq", "esq", "dir"}, "esq", "Sua mae já mandou você ir comprar 1 real disso.", "PAO");

        alimento.inserir(new String[]{"esq", "dir"}, "dir", "É um tipo de cereal.", "");
        alimento.inserir(new String[]{"esq", "dir"}, "esq", "Consumido geralmente no almoço.", "");

        alimento.inserir(new String[]{"esq", "dir", "esq"}, "dir", "Compõe a lasanha.", "MACARRAO");
        alimento.inserir(new String[]{"esq", "dir", "esq"}, "esq", "No prato de um pedreiro não pode faltar.", "FEIJAO");

        alimento.inserir(new String[]{"esq", "dir", "dir"}, "dir", "\"Olha a vêia\".", "AVEIA");
        alimento.inserir(new String[]{"esq", "dir", "dir"}, "esq", "É branco e consumido geralmente no almoço", "ARROZ");

        //elementos da direita
        alimento.inserir(new String[]{}, "dir", "É doce.", "");

        alimento.inserir(new String[]{"dir"}, "dir", "É comido frio ou gelado.", "");
        alimento.inserir(new String[]{"dir"}, "esq", "É produzido em forno.", "");

        alimento.inserir(new String[]{"dir", "dir"}, "dir", "Geralmente encontrados em lanchonetes.", "");
        alimento.inserir(new String[]{"dir", "dir"}, "esq", "Geralmente vendido por ambulantes.", "");

        alimento.inserir(new String[]{"dir", "esq"}, "dir", "Tem forma arredondada.", "");
        alimento.inserir(new String[]{"dir", "esq"}, "esq", "Encontrado frequentemente em aniversários.", "");

        alimento.inserir(new String[]{"dir", "esq", "esq"}, "dir", "Consumido depois do parabéns.", "TORTA");
        alimento.inserir(new String[]{"dir", "esq", "esq"}, "esq", "Geralmente possui granulado por cima.", "BRIGADEIRO");

        alimento.inserir(new String[]{"dir", "esq", "dir"}, "dir", "________ ou biscoito?.", "BISCOITO");
        alimento.inserir(new String[]{"dir", "esq", "dir"}, "esq", "Quando fica no bolso esfarela.", "PACOCA");

        alimento.inserir(new String[]{"dir", "dir", "dir"}, "dir", "Geralmente é vendido em casquinha.", "SORVETE");
        alimento.inserir(new String[]{"dir", "dir", "dir"}, "esq", "Afrodisíaco.", "ACAI");

        alimento.inserir(new String[]{"dir", "dir", "esq"}, "dir", "Cuidado para não engolir o saco.", "DINDIN");
        alimento.inserir(new String[]{"dir", "dir", "esq"}, "esq", "Você sempre queria tirar o palito premiado mas nunca conseguiu.", "PICOLE");
        return alimento;
    }

    public ArvoreBinaria animal() {
        //Árvore de animais.
        ArvoreBinaria animal = new ArvoreBinaria("Animais");

        animal.inserir(new String[]{}, " ", "É um animal.", "");

        //elementos da esquerda
        animal.inserir(new String[]{}, "esq", "É mamífero.", "");

        animal.inserir(new String[]{"esq"}, "dir", "É marinho.", "");
        animal.inserir(new String[]{"esq"}, "esq", "É terreste.", "");

        animal.inserir(new String[]{"esq", "esq"}, "dir", "É selvagem.", "");
        animal.inserir(new String[]{"esq", "esq"}, "esq", "É doméstico.", "");

        animal.inserir(new String[]{"esq", "esq", "esq"}, "dir", "É peludo e vive se lambendo.", "GATO");
        animal.inserir(new String[]{"esq", "esq", "esq"}, "esq", "Muitos são chamados de pulguento.", "CACHORRO");

        animal.inserir(new String[]{"esq", "esq", "dir"}, "dir", "Usam o pescoço para brigar.", "GIRAFA");
        animal.inserir(new String[]{"esq", "esq", "dir"}, "esq", "Parece com um ser Humano.", "MACACO");

        animal.inserir(new String[]{"esq", "dir"}, "dir", "Adaptados a vida aquática e terreste.", "");
        animal.inserir(new String[]{"esq", "dir"}, "esq", "Vive exclusivamente na água.", "");

        animal.inserir(new String[]{"esq", "dir", "esq"}, "dir", "Maior animal aquático.", "BALEIA");
        animal.inserir(new String[]{"esq", "dir", "esq"}, "esq", "É dócil com humanos.", "GOLFINHO");

        animal.inserir(new String[]{"esq", "dir", "dir"}, "dir", "Tem presa e bigode.", "MORSA");
        animal.inserir(new String[]{"esq", "dir", "dir"}, "esq", "Imitação da deepweb da foca.", "LEAO MARINHO");

        //elementos da direita
        animal.inserir(new String[]{}, "dir", "É um inseto.", "");

        animal.inserir(new String[]{"dir"}, "dir", "Voa.", "");
        animal.inserir(new String[]{"dir"}, "esq", "É Terrestre.", "");

        animal.inserir(new String[]{"dir", "dir"}, "dir", "Pode ferroar.", "");
        animal.inserir(new String[]{"dir", "dir"}, "esq", "Encontrado perto de casa.", "");

        animal.inserir(new String[]{"dir", "esq"}, "dir", "Vive em grupo.", "");
        animal.inserir(new String[]{"dir", "esq"}, "esq", "É venenoso.", "");

        animal.inserir(new String[]{"dir", "esq", "esq"}, "dir", "Tem 8 pernas.", "ARANHA");
        animal.inserir(new String[]{"dir", "esq", "esq"}, "esq", "Possui ferrão na calda.", "ESCORPIAO");

        animal.inserir(new String[]{"dir", "esq", "dir"}, "dir", "Come seu guarda-roupa.", "CUPIM");
        animal.inserir(new String[]{"dir", "esq", "dir"}, "esq", "Carrega o dobro do peso.", "FORMIGA");

        animal.inserir(new String[]{"dir", "dir", "dir"}, "dir", "É preto, tem nome do capeta e todo mundo tem medo.", "CAVALO DO CAO");
        animal.inserir(new String[]{"dir", "dir", "dir"}, "esq", "Depois da ferroada, morre.", "ABELHA");

        animal.inserir(new String[]{"dir", "dir", "esq"}, "dir", "Pertuba você a noite.", "MURICOCA");
        animal.inserir(new String[]{"dir", "dir", "esq"}, "esq", "O mais bonito dos insetos.", "BORBOLETA");

        return animal;
    }
    /*
    public static void main(String[] args) {

        ArrayList<Participante> fila = new ArrayList();

        fila.add(new Participante("Joao", true));
        fila.add(new Participante("Maria", false));
        fila.add(new Participante("Felipe", false));
        fila.add(new Participante("Fernanda", false));
        fila.add(new Participante("Luciana", false));

        HeapBinaria heap = new HeapBinaria();

        heap.buildHeap(fila); //Pega a o ArrayList desordenado e ordena.

        ProjetoFinalLEDA pj = new ProjetoFinalLEDA();
        pj.transporte();

        String[] dicas = new String[5];

        String d = pj.transporte().caminhoAleatorio(dicas);

        for (int i = 0; i < dicas.length; i++) {
            System.out.println(dicas[i]);
        }
        System.out.println(d);
    }
     */
}
