import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPessoa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Criando componentes
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        JTextField telefoneField = new JTextField(20);

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField(20);

        JButton cadastrarButton = new JButton("Cadastrar");
        JTextArea outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        // Adicionando os componentes ao frame
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(telefoneLabel);
        frame.add(telefoneField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(cadastrarButton);
        frame.add(new JScrollPane(outputArea));

        // Definindo ação para o botão
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coletando dados dos campos
                String nome = nomeField.getText();
                String telefone = telefoneField.getText();
                String email = emailField.getText();

                // Verificando se os campos estão vazios
                if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Todos os campos devem ser preenchidos!");
                } else {
                    // Criando uma pessoa com os dados informados
                    Pessoa pessoa = new Pessoa(nome, telefone, email);

                    // Exibindo os dados cadastrados na área de texto
                    outputArea.setText(pessoa.toString());
                }
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }
}
