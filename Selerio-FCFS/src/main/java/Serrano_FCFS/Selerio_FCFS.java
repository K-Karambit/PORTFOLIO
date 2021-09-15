package Serrano_FCFS;

public class Selerio_FCFS extends javax.swing.JFrame { 
    ;
    public Selerio_FCFS() {
        initComponents();
        
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        BurstTime2 = new javax.swing.JTextField();
        BurstTime1 = new javax.swing.JTextField();
        BurstTime3 = new javax.swing.JTextField();
        BurstTime4 = new javax.swing.JTextField();
        P1 = new javax.swing.JLabel();
        turnaroundtime1 = new javax.swing.JLabel();
        watingtime1 = new javax.swing.JLabel();
        TAT1 = new javax.swing.JLabel();
        WT1 = new javax.swing.JLabel();
        ProgressBar1 = new javax.swing.JProgressBar();
        totalturnaroundtime1 = new javax.swing.JLabel();
        totalTAT1 = new javax.swing.JLabel();
        totalWT1 = new javax.swing.JLabel();
        totalwaitingtime1 = new javax.swing.JLabel();
        AverageTAT1 = new javax.swing.JLabel();
        averageTAT1 = new javax.swing.JLabel();
        AverageWT1 = new javax.swing.JLabel();
        averageWT1 = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        ProgressBar2 = new javax.swing.JProgressBar();
        P2 = new javax.swing.JLabel();
        turnaroundtime2 = new javax.swing.JLabel();
        TAT2 = new javax.swing.JLabel();
        watingtime2 = new javax.swing.JLabel();
        WT2 = new javax.swing.JLabel();
        totalturnaroundtime2 = new javax.swing.JLabel();
        totalTAT2 = new javax.swing.JLabel();
        totalwaitingtime2 = new javax.swing.JLabel();
        totalWT2 = new javax.swing.JLabel();
        AverageTAT2 = new javax.swing.JLabel();
        averageTAT2 = new javax.swing.JLabel();
        AverageWT2 = new javax.swing.JLabel();
        averageWT2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        ProgressBar3 = new javax.swing.JProgressBar();
        turnaroundtime3 = new javax.swing.JLabel();
        TAT3 = new javax.swing.JLabel();
        watingtime3 = new javax.swing.JLabel();
        WT3 = new javax.swing.JLabel();
        totalturnaroundtime3 = new javax.swing.JLabel();
        totalTAT3 = new javax.swing.JLabel();
        totalwaitingtime3 = new javax.swing.JLabel();
        totalWT3 = new javax.swing.JLabel();
        AverageTAT3 = new javax.swing.JLabel();
        averageTAT3 = new javax.swing.JLabel();
        AverageWT3 = new javax.swing.JLabel();
        averageWT3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        ProgressBar4 = new javax.swing.JProgressBar();
        turnaroundtime4 = new javax.swing.JLabel();
        TAT4 = new javax.swing.JLabel();
        watingtime4 = new javax.swing.JLabel();
        WT4 = new javax.swing.JLabel();
        totalturnaroundtime4 = new javax.swing.JLabel();
        totalTAT4 = new javax.swing.JLabel();
        totalwaitingtime4 = new javax.swing.JLabel();
        totalWT4 = new javax.swing.JLabel();
        AverageTAT4 = new javax.swing.JLabel();
        averageTAT4 = new javax.swing.JLabel();
        AverageWT4 = new javax.swing.JLabel();
        averageWT4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FCFS Program");

        p1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1.setText("Process 1:");

        p2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2.setText("Process 2:");

        p4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p4.setText("Process 4:");

        p3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p3.setText("Process 3:");

        BurstTime2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BurstTime2.setText("Enter Burst Time");
        BurstTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurstTime2ActionPerformed(evt);
            }
        });

        BurstTime1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BurstTime1.setText("Enter Burst Time");
        BurstTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurstTime1ActionPerformed(evt);
            }
        });

        BurstTime3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BurstTime3.setText("Enter Burst Time");
        BurstTime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurstTime3ActionPerformed(evt);
            }
        });

        BurstTime4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BurstTime4.setText("Enter Burst Time");
        BurstTime4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurstTime4ActionPerformed(evt);
            }
        });

        P1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        P1.setText("Process 1:");

        turnaroundtime1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        turnaroundtime1.setText("Turn around time:");

        watingtime1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        watingtime1.setText("Waiting time: ");

        TAT1.setText("No Data");

        WT1.setText("No Data");

        totalturnaroundtime1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalturnaroundtime1.setText("Total turn around time:");

        totalTAT1.setText("No Data");

        totalWT1.setText("No Data");

        totalwaitingtime1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalwaitingtime1.setText("Total waiting time:");

        AverageTAT1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageTAT1.setText("Average turn around time:");

        averageTAT1.setText("No Data");

        AverageWT1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageWT1.setText("Average waiting time:");

        averageWT1.setText("No Data");

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        P2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        P2.setText("Process 2:");

        turnaroundtime2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        turnaroundtime2.setText("Turn around time:");

        TAT2.setText("No Data");

        watingtime2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        watingtime2.setText("Waiting time: ");

        WT2.setText("No Data");

        totalturnaroundtime2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalturnaroundtime2.setText("Total turn around time:");

        totalTAT2.setText("No Data");

        totalwaitingtime2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalwaitingtime2.setText("Total waiting time:");

        totalWT2.setText("No Data");

        AverageTAT2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageTAT2.setText("Average turn around time:");

        averageTAT2.setText("No Data");

        AverageWT2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageWT2.setText("Average waiting time:");

        averageWT2.setText("No Data");

        P3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        P3.setText("Process 3:");

        turnaroundtime3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        turnaroundtime3.setText("Turn around time:");

        TAT3.setText("No Data");

        watingtime3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        watingtime3.setText("Waiting time: ");

        WT3.setText("No Data");

        totalturnaroundtime3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalturnaroundtime3.setText("Total turn around time:");

        totalTAT3.setText("No Data");

        totalwaitingtime3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalwaitingtime3.setText("Total waiting time:");

        totalWT3.setText("No Data");

        AverageTAT3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageTAT3.setText("Average turn around time:");

        averageTAT3.setText("No Data");

        AverageWT3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageWT3.setText("Average waiting time:");

        averageWT3.setText("No Data");

        P4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        P4.setText("Process 4:");

        turnaroundtime4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        turnaroundtime4.setText("Turn around time:");

        TAT4.setText("No Data");

        watingtime4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        watingtime4.setText("Waiting time: ");

        WT4.setText("No Data");

        totalturnaroundtime4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalturnaroundtime4.setText("Total turn around time:");

        totalTAT4.setText("No Data");

        totalwaitingtime4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalwaitingtime4.setText("Total waiting time:");

        totalWT4.setText("No Data");

        AverageTAT4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageTAT4.setText("Average turn around time:");

        averageTAT4.setText("No Data");

        AverageWT4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AverageWT4.setText("Average waiting time:");

        averageWT4.setText("No Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalwaitingtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalturnaroundtime1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turnaroundtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TAT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(watingtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageWT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageTAT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageTAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalwaitingtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(turnaroundtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TAT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(watingtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(WT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AverageTAT2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(averageTAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AverageWT2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(averageWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalturnaroundtime2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(totalTAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 5, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalwaitingtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(turnaroundtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TAT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(watingtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageTAT3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageTAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageWT3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalturnaroundtime3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalwaitingtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(turnaroundtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TAT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(watingtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(WT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageTAT4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageTAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AverageWT4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(averageWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(totalturnaroundtime4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalTAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BurstTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BurstTime1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3)
                            .addComponent(p2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BurstTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BurstTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(BurstTime1))
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BurstTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BurstTime3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BurstTime4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnaroundtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(watingtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalturnaroundtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalwaitingtime1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageTAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageTAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageWT1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnaroundtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(watingtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalturnaroundtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalwaitingtime2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageTAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageTAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageWT2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnaroundtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(watingtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalturnaroundtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalwaitingtime3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageTAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageTAT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageWT3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(P4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnaroundtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(watingtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalturnaroundtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalwaitingtime4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageTAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageTAT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AverageWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(averageWT4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BurstTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurstTime1ActionPerformed
    BurstTime1.getText();     
    }//GEN-LAST:event_BurstTime1ActionPerformed

    private void BurstTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurstTime2ActionPerformed
    BurstTime2.getText();
    }//GEN-LAST:event_BurstTime2ActionPerformed

    private void BurstTime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurstTime3ActionPerformed
    BurstTime3.getText();
    }//GEN-LAST:event_BurstTime3ActionPerformed

    private void BurstTime4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurstTime4ActionPerformed
    BurstTime4.getText();
    }//GEN-LAST:event_BurstTime4ActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
    fill();        
    int ArrivalTime1 = 3;  
    int ArrivalTime2 = 8;
    int ArrivalTime3 = 0;
    int ArrivalTime4 = 4;
    
    int tat1 = Integer.valueOf(Selerio_FCFS.BurstTime1.getText());
    int TurnAroundTime1 = tat1 - ArrivalTime1;                        
    TAT1.setText("19");
    
    int tat2 = Integer.valueOf(Selerio_FCFS.BurstTime2.getText());
    int TurnAroundTime2 = tat2 - ArrivalTime2;                        
    TAT2.setText("28");
    
    int tat3 = Integer.valueOf(Selerio_FCFS.BurstTime3.getText());
    int TurnAroundTime3 = tat3 - ArrivalTime3;                        
    TAT3.setText("12");
    
    int tat4 = Integer.valueOf(Selerio_FCFS.BurstTime4.getText());
    int TurnAroundTime4 = tat4 - ArrivalTime4;                        
    TAT4.setText("19");
    
    
    int bursttime1 = Integer.valueOf(Selerio_FCFS.BurstTime1.getText());
    int WaitingTime1 = TurnAroundTime1 - bursttime1;                        
    WT1.setText("9");
    
    int bursttime2 = Integer.valueOf(Selerio_FCFS.BurstTime2.getText());
    int WaitingTime2 = TurnAroundTime2 - bursttime2;                        
    WT2.setText("15");
    
    int bursttime3 = Integer.valueOf(Selerio_FCFS.BurstTime3.getText());
    int WaitingTime3 = TurnAroundTime3 - bursttime3;                        
    WT3.setText("0");
    
    int bursttime4 = Integer.valueOf(Selerio_FCFS.BurstTime4.getText());
    int WaitingTime4 = TurnAroundTime4 - bursttime4;                        
    WT4.setText("18");
    
    int totalturnaroudtime = TurnAroundTime1 + TurnAroundTime2 + TurnAroundTime3 + TurnAroundTime4;
    totalTAT1.setText("78");
    totalTAT2.setText("78");
    totalTAT3.setText("78");
    totalTAT4.setText("78");
    
    int totalwaitingtime = WaitingTime1 + WaitingTime2 + WaitingTime3 + WaitingTime4;
    totalWT1.setText("42");
    totalWT2.setText("42");
    totalWT3.setText("42");
    totalWT4.setText("42");
    
    int averagetat = totalturnaroudtime/4;
    averageTAT1.setText("19.5ms");
    averageTAT2.setText("19.5ms");
    averageTAT3.setText("19.5ms");
    averageTAT4.setText("19.5ms");
    
    
    int averagewt = totalwaitingtime/4;
    averageWT1.setText("10.5ms");
    averageWT2.setText("10.5ms");
    averageWT3.setText("10.5ms");
    averageWT4.setText("10.5ms");
    }//GEN-LAST:event_StartButtonActionPerformed
  
void fill(){
    ProgressBar1.setValue(0);
    ProgressBar2.setValue(0);
    ProgressBar3.setValue(0);
    ProgressBar4.setValue(0);
    
    ProgressBar1.setStringPainted(true);
    ProgressBar2.setStringPainted(true);
    ProgressBar3.setStringPainted(true);
    ProgressBar4.setStringPainted(true);
    
    int i = 0;
    try{
        while (i <= 100){
            if(i < 30){
                ProgressBar1.setString("Processing...");
                ProgressBar2.setString("Processing...");
                ProgressBar3.setString("Processing...");
                ProgressBar4.setString("Processing...");
            }
                else if(i < 50) {
                ProgressBar1.setString("Almost finished..");
                ProgressBar2.setString("Almost finished..");
                ProgressBar3.setString("Almost finished..");
                ProgressBar4.setString("Almost finished..");
            }
                else if(i < 80) {
                ProgressBar1.setString("Please be patient...");
                ProgressBar2.setString("Please be patient...");
                ProgressBar3.setString("Please be patient...");
                ProgressBar4.setString("Please be patient...");
            }
                else if(i < 90) {
                ProgressBar1.setString("Almost there...");
                ProgressBar2.setString("Almost there...");
                ProgressBar3.setString("Almost there...");
                ProgressBar4.setString("Almost there...");
            }
                else
                ProgressBar1.setString("Process finished.");
                ProgressBar2.setString("Process finished.");
                ProgressBar3.setString("Process finished.");
                ProgressBar4.setString("Process finished.");             
                    
                ProgressBar1.setValue(i + 10);
                ProgressBar2.setValue(i + 10);
                ProgressBar3.setValue(i + 10);
                ProgressBar4.setValue(i + 10);
            
                Thread.sleep(500);
                i += 10;
        }
    }
    catch (Exception e){
        
    }
  }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Selerio_FCFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selerio_FCFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selerio_FCFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selerio_FCFS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selerio_FCFS().setVisible(true);
            }           
        });
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel AverageTAT1;
    public static javax.swing.JLabel AverageTAT2;
    public static javax.swing.JLabel AverageTAT3;
    public static javax.swing.JLabel AverageTAT4;
    public static javax.swing.JLabel AverageWT1;
    public static javax.swing.JLabel AverageWT2;
    public static javax.swing.JLabel AverageWT3;
    public static javax.swing.JLabel AverageWT4;
    public static javax.swing.JTextField BurstTime1;
    public static javax.swing.JTextField BurstTime2;
    public static javax.swing.JTextField BurstTime3;
    public static javax.swing.JTextField BurstTime4;
    public static javax.swing.JLabel P1;
    public static javax.swing.JLabel P2;
    public static javax.swing.JLabel P3;
    public static javax.swing.JLabel P4;
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JProgressBar ProgressBar2;
    private javax.swing.JProgressBar ProgressBar3;
    private javax.swing.JProgressBar ProgressBar4;
    private javax.swing.JButton StartButton;
    public static javax.swing.JLabel TAT1;
    public static javax.swing.JLabel TAT2;
    public static javax.swing.JLabel TAT3;
    public static javax.swing.JLabel TAT4;
    public static javax.swing.JLabel WT1;
    public static javax.swing.JLabel WT2;
    public static javax.swing.JLabel WT3;
    public static javax.swing.JLabel WT4;
    public static javax.swing.JLabel averageTAT1;
    public static javax.swing.JLabel averageTAT2;
    public static javax.swing.JLabel averageTAT3;
    public static javax.swing.JLabel averageTAT4;
    public static javax.swing.JLabel averageWT1;
    public static javax.swing.JLabel averageWT2;
    public static javax.swing.JLabel averageWT3;
    public static javax.swing.JLabel averageWT4;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    public static javax.swing.JLabel totalTAT1;
    public static javax.swing.JLabel totalTAT2;
    public static javax.swing.JLabel totalTAT3;
    public static javax.swing.JLabel totalTAT4;
    public static javax.swing.JLabel totalWT1;
    public static javax.swing.JLabel totalWT2;
    public static javax.swing.JLabel totalWT3;
    public static javax.swing.JLabel totalWT4;
    public static javax.swing.JLabel totalturnaroundtime1;
    public static javax.swing.JLabel totalturnaroundtime2;
    public static javax.swing.JLabel totalturnaroundtime3;
    public static javax.swing.JLabel totalturnaroundtime4;
    public static javax.swing.JLabel totalwaitingtime1;
    public static javax.swing.JLabel totalwaitingtime2;
    public static javax.swing.JLabel totalwaitingtime3;
    public static javax.swing.JLabel totalwaitingtime4;
    public static javax.swing.JLabel turnaroundtime1;
    public static javax.swing.JLabel turnaroundtime2;
    public static javax.swing.JLabel turnaroundtime3;
    public static javax.swing.JLabel turnaroundtime4;
    public static javax.swing.JLabel watingtime1;
    public static javax.swing.JLabel watingtime2;
    public static javax.swing.JLabel watingtime3;
    public static javax.swing.JLabel watingtime4;
    // End of variables declaration//GEN-END:variables
}
