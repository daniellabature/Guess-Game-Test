package guessit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import java.util.Random;

public class GuessGame extends JFrame implements ActionListener{
    
    Random target_num = new Random();
    int target;
    Dimension numSize = new Dimension(45,45);
    Color lightBlueClr = Color.decode("#cce6ff");
    Color darkBlueClr = Color.decode("#434a8c");
    ImageIcon logo = new ImageIcon(GuessGame.class.getClassLoader().getResource("guess_it_logo.png"));
    Image logo1 = logo.getImage();
    
    JPanel wholeSpan = new JPanel();
    JPanel headingPanel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel numberPanel = new JPanel();
    JPanel bottomPan = new JPanel();
    
    JLabel headingLbl = new JLabel();
    JLabel rulesLbl = new JLabel("Guess a number between 1 and 20. "
                                + "You only have 5 attempts to get it right!");
    JTextField numberTxt = new JTextField(10);
    JLabel triesLbl = new JLabel("Tries Left:");
    JTextField attemptsTxt = new JTextField(10);
    
    JButton zeroBtn = new JButton("0");
    JButton oneBtn = new JButton("1");
    JButton twoBtn = new JButton("2");
    JButton threeBtn = new JButton("3");
    JButton fourBtn = new JButton("4");
    JButton fiveBtn = new JButton("5");
    JButton sixBtn = new JButton("6");
    JButton sevenBtn = new JButton("7");
    JButton eightBtn = new JButton("8");
    JButton nineBtn = new JButton("9");
    JButton guessBtn = new JButton("Guess It!");
    JButton clearBtn = new JButton("Clear");
    JButton resetBtn = new JButton("New Game");
    JButton closeBtn = new JButton("Close");
    
    public GuessGame(){
        setLayout(new FlowLayout());
        setSize(500,500);
        setTitle("Guess It!");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        this.setIconImage(logo1);
        
        wholeSpan.setLayout(new FlowLayout());
        wholeSpan.setPreferredSize(new Dimension(500, 500));
        wholeSpan.setBackground(darkBlueClr);
        add(wholeSpan);
        
        headingPanel.setLayout(new FlowLayout());
        headingPanel.setPreferredSize(new Dimension(100, 100));
        headingLbl.setIcon(logo);
        headingLbl.setPreferredSize(new Dimension(100, 100));
        headingPanel.add(headingLbl);
        wholeSpan.add(headingPanel);
        
        panel1.setLayout(new FlowLayout());
        panel1.setPreferredSize(new Dimension(450,60));
        panel1.setBackground(lightBlueClr);
        panel1.add(rulesLbl);
        panel1.add(numberTxt);
        panel1.add(guessBtn);
        panel1.add(clearBtn);
        wholeSpan.add(panel1);
        
        numberPanel.setLayout(new FlowLayout());
        numberPanel.setPreferredSize(new Dimension(150,210));
        numberPanel.setBackground(darkBlueClr);
        oneBtn.setPreferredSize(numSize);
        numberPanel.add(oneBtn);
        twoBtn.setPreferredSize(numSize);
        numberPanel.add(twoBtn);
        threeBtn.setPreferredSize(numSize);
        numberPanel.add(threeBtn);
        fourBtn.setPreferredSize(numSize);
        numberPanel.add(fourBtn);
        fiveBtn.setPreferredSize(numSize);
        numberPanel.add(fiveBtn);
        sixBtn.setPreferredSize(numSize);
        numberPanel.add(sixBtn);
        sevenBtn.setPreferredSize(numSize);
        numberPanel.add(sevenBtn);
        eightBtn.setPreferredSize(numSize);
        numberPanel.add(eightBtn);
        nineBtn.setPreferredSize(numSize);
        numberPanel.add(nineBtn);
        zeroBtn.setPreferredSize(numSize);
        numberPanel.add(zeroBtn);
        wholeSpan.add(numberPanel);
        
        bottomPan.setLayout(new FlowLayout());
        bottomPan.setPreferredSize(new Dimension(400,60));
        bottomPan.setBackground(lightBlueClr);
        bottomPan.add(triesLbl);
        bottomPan.add(attemptsTxt);
        bottomPan.add(resetBtn);
        bottomPan.add(closeBtn);
        wholeSpan.add(bottomPan);
        
        numberTxt.setEditable(false);
        attemptsTxt.setEditable(false);
        attemptsTxt.setText("5");
        
        zeroBtn.addActionListener(this);
        oneBtn.addActionListener(this);
        twoBtn.addActionListener(this);
        threeBtn.addActionListener(this);
        fourBtn.addActionListener(this);
        fiveBtn.addActionListener(this);
        sixBtn.addActionListener(this);
        sevenBtn.addActionListener(this);
        eightBtn.addActionListener(this);
        nineBtn.addActionListener(this);
        guessBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        closeBtn.addActionListener(this);
        
        target = 1 + target_num.nextInt(20);
    }
    
    
    
    public void actionPerformed(ActionEvent e){
        String buttonNr = "";
        int guess, tries;
        
        if(e.getSource() == zeroBtn){
            buttonNr = numberTxt.getText() + "0";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == oneBtn){
            buttonNr = numberTxt.getText() + "1";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == twoBtn){
            buttonNr = numberTxt.getText() + "2";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == threeBtn){
            buttonNr = numberTxt.getText() + "3";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == fourBtn){
            buttonNr = numberTxt.getText() + "4";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == fiveBtn){
            buttonNr = numberTxt.getText() + "5";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == sixBtn){
            buttonNr = numberTxt.getText() + "6";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == sevenBtn){
            buttonNr = numberTxt.getText() + "7";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == eightBtn){
            buttonNr = numberTxt.getText() + "8";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == nineBtn){
            buttonNr = numberTxt.getText() + "9";
            numberTxt.setText(buttonNr);
        }
        else if(e.getSource() == resetBtn){
            attemptsTxt.setText("5");
            numberTxt.setText("");
            target = 1 + target_num.nextInt(20);
            guessBtn.setEnabled(true);
            clearBtn.setEnabled(true);
        }
        else if(e.getSource() == clearBtn){
            numberTxt.setText("");
        }
        else if(e.getSource() == closeBtn){
            dispose();
        }
        else if(e.getSource() == guessBtn){
            guess = Integer.parseInt(numberTxt.getText());
            tries = Integer.parseInt(attemptsTxt.getText());
            if(tries == 0){
                JOptionPane.showMessageDialog(null,"Game Over! You have run out of tries!" + "\n"
                                                + "Click on 'New Game' to play again.");
                guessBtn.setEnabled(false);
                clearBtn.setEnabled(false);
            }
            if(guess > 20){
                JOptionPane.showMessageDialog(null,"Your number is out of the range! Please choose a number between 1 and 20.");
                numberTxt.setText("");
            }
            else if(guess < target){
                JOptionPane.showMessageDialog(null,"Too Low! Try Again.");
                numberTxt.setText("");
                tries--;
                attemptsTxt.setText("" + tries);
                if(tries == 0){
                    JOptionPane.showMessageDialog(null,"Game Over! You have run out of tries!" + "\n"
                                                + "Click on 'New Game' to play again.");
                    guessBtn.setEnabled(false);
                    clearBtn.setEnabled(false);
                }
            }
            else if(guess > target){
                JOptionPane.showMessageDialog(null,"Too High! Try Again.");
                numberTxt.setText("");
                tries--;
                attemptsTxt.setText("" + tries);
                if(tries == 0){
                    JOptionPane.showMessageDialog(null,"Game Over! You have run out of tries!" + "\n"
                                                + "Click on 'New Game' to play again.");
                    guessBtn.setEnabled(false);
                    clearBtn.setEnabled(false);
                }
            }
            else if(guess == target){
                JOptionPane.showMessageDialog(null,"Well Done! You Got It!");
                JOptionPane.showMessageDialog(null,"Click on 'New Game' to play again.");
                guessBtn.setEnabled(false);
                clearBtn.setEnabled(false);
            }
        }
    }
    
    public static void main(String[] args){
        GuessGame new_game = new GuessGame();
    }
}
