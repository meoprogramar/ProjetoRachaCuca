package frontEnd;

import backEnd.ArvoreBinaria;
import backEnd.HeapBinaria;
import backEnd.Participante;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mateus Cavalcante
 */
public class telaJogador extends javax.swing.JFrame {

    public ArrayList<Participante> participantes;
    public ArrayList<Participante> ranking;
    public ArvoreBinaria[] Arvores;
    public String resultado;
    public int jogador = 0;
    public int numDica = 0;
    String[] dicas = new String[5];
    static Random r = new Random();
    HeapBinaria heap = new HeapBinaria();

    public telaJogador(ArrayList<Participante> part, ArvoreBinaria[] Arv) {
        participantes = part;
        ranking = (ArrayList<Participante>) part.clone();
        Arvores = Arv;        
        initComponents();
    }
    
    public static void insertSort(ArrayList<Participante> v)
    {
        Participante aux;
        int j;
        for(int i=1; i<v.size(); i++)
        {
            aux = v.get(i);
            j=i-1;
            while( j>=0 && v.get(j).pont<aux.pont )
            {
                v.set(j+1, v.get(j));
                j--;
            }
            v.set(j+1, aux);         
        }
    }  
    
    public void inserirRanking()
    {
        insertSort(ranking);     
        
            lbljogador01.setText(ranking.get(0).nome); lblptsjogador01.setText(ranking.get(0).pont+"");
            if(ranking.size()>=2)
            {
                lbljogador02.setText(ranking.get(1).nome); 
                lblptsjogador02.setText(ranking.get(1).pont+"");
            }
            if(ranking.size()>=3)
            {
                lbljogador03.setText(ranking.get(2).nome); 
                lblptsjogador03.setText(ranking.get(2).pont+"");
            }
            if(ranking.size()>=4)
            {
                lbljogador04.setText(ranking.get(3).nome); 
                lblptsjogador04.setText(ranking.get(3).pont+"");
            }
    }
    
    public void fila()
    {
        if(!participantes.isEmpty())
        {
            lblprimeiro.setText(participantes.get(0).nome);
            if(participantes.size()>=2)
                lblsegundo.setText(participantes.get(1).nome);
            else
                lblsegundo.setText("");
            if(participantes.size()>=3)
                lblterceiro.setText(participantes.get(2).nome);
            else
                lblterceiro.setText("");
            if(participantes.size()>=4)
                lblquarto.setText(participantes.get(3).nome);
            else
                lblquarto.setText("");
        }
    }
    
    public void setInfos() {
        if(participantes.isEmpty())
        {
            insertSort(ranking);
            JOptionPane.showMessageDialog(null, "Fim de jogo!");
            TelaFinal d = new TelaFinal(ranking);
            d.setTelas();
            d.setVisible(true);
            dispose();           
        } 
        else
        {      
            inserirRanking();
            fila();
            numDica=0;
            lblJogadordaVez.setText(participantes.get(0).nome);
            resultado = Arvores[r.nextInt(3)].caminhoAleatorio(dicas); //Gera uma árvore aleatoria
            lblDica.setText(dicas[numDica]);             
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblJogadordaVez = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmpResposta = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDica = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbljogador01 = new javax.swing.JLabel();
        lblptsjogador01 = new javax.swing.JLabel();
        lbljogador02 = new javax.swing.JLabel();
        lblptsjogador02 = new javax.swing.JLabel();
        lbljogador03 = new javax.swing.JLabel();
        lblptsjogador03 = new javax.swing.JLabel();
        lbljogador04 = new javax.swing.JLabel();
        lblptsjogador04 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblprimeiro = new javax.swing.JLabel();
        lblsegundo = new javax.swing.JLabel();
        lblterceiro = new javax.swing.JLabel();
        lblquarto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vez de");

        lblJogadordaVez.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblJogadordaVez.setForeground(new java.awt.Color(51, 51, 51));
        lblJogadordaVez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogadordaVez.setText("Fulaninho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblJogadordaVez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJogadordaVez)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Dica");

        cmpResposta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmpResposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cmpResposta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmpRespostaMouseClicked(evt);
            }
        });
        cmpResposta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmpRespostaKeyReleased(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(51, 51, 51));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        lblDica.setEditable(false);
        lblDica.setBorder(null);
        lblDica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDica.setForeground(new java.awt.Color(57, 57, 57));
        jScrollPane1.setViewportView(lblDica);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logomenor.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(cmpResposta)
                            .addComponent(jScrollPane1)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(174, 174, 174))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmpResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );

        jLabel5.setBackground(new java.awt.Color(218, 255, 239));
        jLabel5.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ranking");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Jogador(s)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Pts");

        lbljogador01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljogador01.setForeground(new java.awt.Color(51, 51, 51));

        lblptsjogador01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblptsjogador01.setForeground(new java.awt.Color(51, 51, 51));

        lbljogador02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljogador02.setForeground(new java.awt.Color(51, 51, 51));
        lbljogador02.setPreferredSize(new java.awt.Dimension(33, 17));

        lblptsjogador02.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblptsjogador02.setForeground(new java.awt.Color(51, 51, 51));

        lbljogador03.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljogador03.setForeground(new java.awt.Color(51, 51, 51));
        lbljogador03.setPreferredSize(new java.awt.Dimension(33, 17));

        lblptsjogador03.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblptsjogador03.setForeground(new java.awt.Color(51, 51, 51));

        lbljogador04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbljogador04.setForeground(new java.awt.Color(51, 51, 51));
        lbljogador04.setPreferredSize(new java.awt.Dimension(33, 17));

        lblptsjogador04.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblptsjogador04.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/trophy (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbljogador02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbljogador01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblptsjogador01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblptsjogador02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbljogador04, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(lbljogador03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblptsjogador04, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblptsjogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(44, 44, 44))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljogador01)
                    .addComponent(lblptsjogador01, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljogador02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblptsjogador02, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljogador03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblptsjogador03, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbljogador04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblptsjogador04, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("À jogar");

        lblprimeiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblprimeiro.setForeground(new java.awt.Color(51, 51, 51));
        lblprimeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblprimeiro.setPreferredSize(new java.awt.Dimension(33, 17));

        lblsegundo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsegundo.setForeground(new java.awt.Color(51, 51, 51));
        lblsegundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsegundo.setPreferredSize(new java.awt.Dimension(33, 17));

        lblterceiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblterceiro.setForeground(new java.awt.Color(51, 51, 51));
        lblterceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblterceiro.setPreferredSize(new java.awt.Dimension(33, 17));

        lblquarto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblquarto.setForeground(new java.awt.Color(51, 51, 51));
        lblquarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquarto.setPreferredSize(new java.awt.Dimension(33, 17));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/line.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblterceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblquarto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(lblprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblterceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblquarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        
        String resposta = cmpResposta.getText();
        if(!resposta.equals(""))
        {
            if (resultado.equals(resposta)) {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou! Resposta: "+resultado);
                heap.extractMax(participantes);
                setInfos();
            } 
            else 
            {
                for (int i = 0; i < ranking.size(); i++) 
                {
                    if(participantes.get(0).nome == ranking.get(i).nome)
                    {
                        if(ranking.get(i).premium)
                            ranking.get(i).pont = ranking.get(i).pont-5;
                        else
                            ranking.get(i).pont = ranking.get(i).pont-10;
                        break;
                    }
                }                
                
                if (numDica < 4) 
                {                
                    numDica++;
                    lblDica.setText(dicas[numDica]); 
                } else {    
                    heap.extractMax(participantes);   
                    JOptionPane.showMessageDialog(null, "Você perdeu! Resposta: "+resultado);
                    setInfos();
                }
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Campo inválido, digite algo.");
        cmpResposta.setText("");   
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cmpRespostaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpRespostaKeyReleased
        


    }//GEN-LAST:event_cmpRespostaKeyReleased

        public void toUpper(JTextField jt) {
        String s = jt.getText().toUpperCase();
        jt.setText(s);
    }
    public void Maiusculo() {
        cmpResposta.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                toUpper(cmpResposta);
            }
        });
    }
    
    private void cmpRespostaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmpRespostaMouseClicked
        Maiusculo();
    }//GEN-LAST:event_cmpRespostaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField cmpResposta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane lblDica;
    private javax.swing.JLabel lblJogadordaVez;
    private javax.swing.JLabel lbljogador01;
    private javax.swing.JLabel lbljogador02;
    private javax.swing.JLabel lbljogador03;
    private javax.swing.JLabel lbljogador04;
    private javax.swing.JLabel lblprimeiro;
    private javax.swing.JLabel lblptsjogador01;
    private javax.swing.JLabel lblptsjogador02;
    private javax.swing.JLabel lblptsjogador03;
    private javax.swing.JLabel lblptsjogador04;
    private javax.swing.JLabel lblquarto;
    private javax.swing.JLabel lblsegundo;
    private javax.swing.JLabel lblterceiro;
    // End of variables declaration//GEN-END:variables
}
