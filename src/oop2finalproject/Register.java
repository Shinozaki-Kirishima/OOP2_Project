/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2finalproject;

import com.sun.glass.events.KeyEvent;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Shinozaki-Kirishima
 */
public class Register extends javax.swing.JFrame{
    //initialize 2 fields, gpa and grade 
    private double gpa;
    private String grade;
    private double mark1,mark2,mark3,mark4,mark5;
    //get the information from the fields
    public String getUserName()
    {
        return this.name.getText();
    }
    public int getId()
    {
        int idValue = Integer.parseInt(this.id.getText());
        return idValue;
    }
    //get marks
    public double getMark1(){
         mark1=Double.parseDouble(this.firstMark.getText());
        return mark1;
    }
    public double getMark2(){
        mark2=Double.parseDouble(this.secondMark.getText());
        return mark2;
    }
    public double getMark3(){
        mark3=Double.parseDouble(this.thirdMark.getText());
        return mark3;
    }
    public double getMark4(){
        mark4=Double.parseDouble(this.fourthMark.getText());
        return mark4;
    }
    public double getMark5(){
        mark5=Double.parseDouble(this.fifthMark.getText());
        return mark5;
    }
    //get estimated gpa from 5 subject marks 
    public void calculateGPA(double mark1, double mark2, double mark3, double mark4, double mark5)
    {//add the 5 subjects 
        double tempTotal;
        tempTotal=mark1+mark2+mark3+mark4+mark5;
        double temp=tempTotal/5; // find average 
        //conditional statement to determine gpa and grade 
        if(temp>=90){
            gpa=4.0;
            grade="A";
        }else if(temp>=85&&temp<90){
            gpa=3.5;
            grade="B+";
        }else if(temp>=80&&temp<85){
            gpa=3.0;
            grade="B";
        }else if(temp>=75&&temp<80){
            gpa=2.5;
            grade="C+";
        }else if(temp>=70&&temp<75){
            gpa=2.0;
            grade="C";
        }else if(temp>=65&&temp<70){
            gpa=1.5;
            grade="D+";
        }else if(temp>=60&&temp<65){
            gpa=1.0;
            grade="D";
        }else{
            grade="F";
        }
    }
    //get the grade and gpa
    public double getGpa(){
        return this.gpa;
    }
    public String getGrade(){
        return this.grade;
    }
    /* If the Register Button is clicked execute a method
       in the Controller named actionPerformed*/
    void addRegistrationListener(ActionListener listenForRegistration)
    {
        this.registerButton.addActionListener(listenForRegistration);
    }
    
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        getConnection();
    }
    //get connection to the database
    public Connection getConnection()
    {
        Connection connection = null;
        try {
            connection=DriverManager.getConnection("jdbc:mariadb://localhost:3306/finalproject","root","");
            return connection;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Not Connected.", "Not Connected",JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registerButton = new javax.swing.JButton();
        Title = new javax.swing.JTextField();
        enterFifthMark = new javax.swing.JTextField();
        enterFourthMark = new javax.swing.JTextField();
        enterThirdMark = new javax.swing.JTextField();
        enterSecondMark = new javax.swing.JTextField();
        enterFirstMark = new javax.swing.JTextField();
        enterID = new javax.swing.JTextField();
        enterName = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        fifthMark = new javax.swing.JTextField();
        fourthMark = new javax.swing.JTextField();
        thirdMark = new javax.swing.JTextField();
        secondMark = new javax.swing.JTextField();
        firstMark = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        registerButton.setBackground(new java.awt.Color(0, 0, 0));
        registerButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(registerButton);
        registerButton.setBounds(190, 560, 220, 50);

        Title.setEditable(false);
        Title.setBackground(new java.awt.Color(0, 0, 0));
        Title.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Title.setText("REGISTER");
        jPanel1.add(Title);
        Title.setBounds(180, 0, 220, 50);

        enterFifthMark.setEditable(false);
        enterFifthMark.setBackground(new java.awt.Color(0, 0, 0));
        enterFifthMark.setForeground(new java.awt.Color(255, 255, 255));
        enterFifthMark.setText("Enter 5th Mark:");
        jPanel1.add(enterFifthMark);
        enterFifthMark.setBounds(10, 370, 110, 30);

        enterFourthMark.setEditable(false);
        enterFourthMark.setBackground(new java.awt.Color(0, 0, 0));
        enterFourthMark.setForeground(new java.awt.Color(255, 255, 255));
        enterFourthMark.setText("Enter 4th Mark:");
        jPanel1.add(enterFourthMark);
        enterFourthMark.setBounds(10, 320, 110, 30);

        enterThirdMark.setEditable(false);
        enterThirdMark.setBackground(new java.awt.Color(0, 0, 0));
        enterThirdMark.setForeground(new java.awt.Color(255, 255, 255));
        enterThirdMark.setText("Enter 3rd Mark:");
        jPanel1.add(enterThirdMark);
        enterThirdMark.setBounds(10, 270, 110, 30);

        enterSecondMark.setEditable(false);
        enterSecondMark.setBackground(new java.awt.Color(0, 0, 0));
        enterSecondMark.setForeground(new java.awt.Color(255, 255, 255));
        enterSecondMark.setText("Enter 2nd Mark:");
        jPanel1.add(enterSecondMark);
        enterSecondMark.setBounds(10, 220, 110, 30);

        enterFirstMark.setEditable(false);
        enterFirstMark.setBackground(new java.awt.Color(0, 0, 0));
        enterFirstMark.setForeground(new java.awt.Color(255, 255, 255));
        enterFirstMark.setText("Enter 1st Mark:");
        jPanel1.add(enterFirstMark);
        enterFirstMark.setBounds(10, 170, 110, 30);

        enterID.setEditable(false);
        enterID.setBackground(new java.awt.Color(0, 0, 0));
        enterID.setForeground(new java.awt.Color(255, 255, 255));
        enterID.setText("Enter ID:");
        jPanel1.add(enterID);
        enterID.setBounds(10, 120, 110, 30);

        enterName.setEditable(false);
        enterName.setBackground(new java.awt.Color(0, 0, 0));
        enterName.setForeground(new java.awt.Color(255, 255, 255));
        enterName.setText("Enter Name:");
        jPanel1.add(enterName);
        enterName.setBounds(10, 70, 110, 30);

        id.setBackground(new java.awt.Color(0, 0, 0));
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(380, 120, 200, 30);

        fifthMark.setBackground(new java.awt.Color(0, 0, 0));
        fifthMark.setForeground(new java.awt.Color(255, 255, 255));
        fifthMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fifthMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fifthMarkKeyTyped(evt);
            }
        });
        jPanel1.add(fifthMark);
        fifthMark.setBounds(380, 370, 200, 30);

        fourthMark.setBackground(new java.awt.Color(0, 0, 0));
        fourthMark.setForeground(new java.awt.Color(255, 255, 255));
        fourthMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fourthMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fourthMarkKeyTyped(evt);
            }
        });
        jPanel1.add(fourthMark);
        fourthMark.setBounds(380, 320, 200, 30);

        thirdMark.setBackground(new java.awt.Color(0, 0, 0));
        thirdMark.setForeground(new java.awt.Color(255, 255, 255));
        thirdMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        thirdMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                thirdMarkKeyTyped(evt);
            }
        });
        jPanel1.add(thirdMark);
        thirdMark.setBounds(380, 270, 200, 30);

        secondMark.setBackground(new java.awt.Color(0, 0, 0));
        secondMark.setForeground(new java.awt.Color(255, 255, 255));
        secondMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                secondMarkKeyTyped(evt);
            }
        });
        jPanel1.add(secondMark);
        secondMark.setBounds(380, 220, 200, 30);

        firstMark.setBackground(new java.awt.Color(0, 0, 0));
        firstMark.setForeground(new java.awt.Color(255, 255, 255));
        firstMark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstMark.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstMarkKeyTyped(evt);
            }
        });
        jPanel1.add(firstMark);
        firstMark.setBounds(380, 170, 200, 30);

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(name);
        name.setBounds(380, 70, 200, 30);

        backGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.png"))); // NOI18N
        jPanel1.add(backGround);
        backGround.setBounds(0, 0, 590, 630);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // store user information in database for further use 
         try
            {//get connecttion to database
                Connection connection=getConnection();
                // prepare sql statement
                String sqlStatement="INSERT INTO students(name,uniqueID,Grade,GPA)"+"values(?,?,?,?)";
                PreparedStatement preparedStatement=connection.prepareStatement(sqlStatement);
                //set fields to prepared statement
                preparedStatement.setString(1, this.getUserName());
                preparedStatement.setInt(2, this.getId());
                //calculate gpa 
                this.calculateGPA(this.getMark1(),this.getMark2(),
                        this.getMark3(),this.getMark4(),this.getMark5());
                
                preparedStatement.setString(3, this.getGrade());
                preparedStatement.setDouble(4, this.getGpa());
                preparedStatement.executeUpdate();
                //take user back to the main page
                this.dispose();//close current frame 
                //create thread to re run our main view 
                EventQueue.invokeLater(() -> {//make event queue
                    try{
                        GPAView view=new GPAView();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "ERROR!");
                    }
                });//create joptionpane that allows users to continue or exit program
                int ok=JOptionPane.showConfirmDialog(null, "Your Data Stored! Would you like to proceed to login?", 
                        "Confirmation",JOptionPane.YES_NO_OPTION);
                if(ok==JOptionPane.YES_OPTION)
                {//if option chosen was yes, 
                    Thread newThread=new Thread(){//create thread 
                        @Override//create our runnable function for thread
                        public void run(){
                            //make instances of our model,view and controller classes
                            GPAView mainView=new GPAView();
                            GPAModel model=new GPAModel();
                            GPAController controller=new GPAController(model, mainView);
                            mainView.setVisible(true);//set our main JFrame visibilty to 'true'
                            mainView.setLocationRelativeTo(null);
                        }
                    };
                    newThread.start();//start new thread
                }else if (ok==JOptionPane.NO_OPTION){//if option chosen was yes
                    System.exit(ok);//exit system
                }
            }catch(HeadlessException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, "An Error Has Occurred.", "Error",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void firstMarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstMarkKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_firstMarkKeyTyped

    private void secondMarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secondMarkKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_secondMarkKeyTyped

    private void thirdMarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thirdMarkKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_thirdMarkKeyTyped

    private void fourthMarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fourthMarkKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fourthMarkKeyTyped

    private void fifthMarkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fifthMarkKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fifthMarkKeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // if any key except numerical keys are typed, consume them 
        char character=evt.getKeyChar();
        if(!(Character.isDigit(character)||(character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            //make a pop up botification, notifying the user when an invalid character is entered
            final ImageIcon icon1 = new ImageIcon("Joptionpane/invalid.gif");
            JOptionPane.showMessageDialog(null, "", "Character Entered is Not Valid!",
            JOptionPane.INFORMATION_MESSAGE, icon1);
        }//if the character is backspaced, beep only 
        if((character==KeyEvent.VK_BACKSPACE)||(character==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Title;
    private javax.swing.JLabel backGround;
    private javax.swing.JTextField enterFifthMark;
    private javax.swing.JTextField enterFirstMark;
    private javax.swing.JTextField enterFourthMark;
    private javax.swing.JTextField enterID;
    private javax.swing.JTextField enterName;
    private javax.swing.JTextField enterSecondMark;
    private javax.swing.JTextField enterThirdMark;
    private javax.swing.JTextField fifthMark;
    private javax.swing.JTextField firstMark;
    private javax.swing.JTextField fourthMark;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField secondMark;
    private javax.swing.JTextField thirdMark;
    // End of variables declaration//GEN-END:variables
}