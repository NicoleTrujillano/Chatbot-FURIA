
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ChatFuriaGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JLabel scoreLabel;

    private int pontuacao = 0;
    private boolean modoQuiz = false;
    private int indiceQuiz = 0;
    private List<String[]> perguntasQuiz;
    private String respostaAtual = "";

    public ChatFuriaGUI() {
        setTitle("Chat FURIA - Torcedor Fiel");
        setSize(500, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel do topo
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBackground(new Color(25, 25, 25));

        // Logo
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/img/logo_furia.png"));
        Image logoImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(logoImage));
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(logoLabel);

        // Título
        JLabel title = new JLabel("🔥 Chat Oficial da FURIA 🔥");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(Color.WHITE);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(title);

        // Pontuação
        scoreLabel = new JLabel("Pontuação: 0");
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        scoreLabel.setForeground(Color.LIGHT_GRAY);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        topPanel.add(scoreLabel);

        add(topPanel, BorderLayout.NORTH);

        // Área de chat
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setBackground(new Color(30, 30, 30));
        chatArea.setForeground(Color.WHITE);
        chatArea.setFont(new Font("Consolas", Font.PLAIN, 14));
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Painel inferior
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(new Color(25, 25, 25));

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));

        sendButton = new JButton("Enviar");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));
        sendButton.setBackground(new Color(0, 120, 215));
        sendButton.setForeground(Color.WHITE);

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);
        add(bottomPanel, BorderLayout.SOUTH);

        // Ações
        sendButton.addActionListener(e -> enviarMensagem());
        inputField.addActionListener(e -> enviarMensagem());

        setVisible(true);
    }

    private void enviarMensagem() {
        String input = inputField.getText().trim().toLowerCase();
        if (!input.isEmpty()) {
            chatArea.append("Você: " + input + "\n");
            inputField.setText("");

            if (modoQuiz) {
                avaliarResposta(input);
            } else {
                responder(input);
            }
        }
    }

    private void responder(String input) {
        switch (input) {
            case "jogos":
                chatArea.append("Bot: O próximo jogo da FURIA é dia 25/04 contra NAVI!\n\n");
                break;
            case "curiosidade":
                chatArea.append("Bot: Sabia que a FURIA começou como time de CS:GO em 2017?\n\n");
                break;
            case "ranking":
                chatArea.append("Bot: A FURIA está atualmente no Top 10 mundial!\n\n");
                break;
            case "estatísticas":
                mostrarEstatisticas();
                break;
            case "quiz":
                iniciarQuiz();
                break;
            case "sair":
                chatArea.append("Bot: Valeu por conversar! Até mais!\n\n");
                break;
            default:
                chatArea.append("Bot: Não entendi 😅 Tente: 'jogos', 'curiosidade', 'ranking', 'quiz', 'estatísticas' ou 'sair'.\n\n");
        }
    }

    private void iniciarQuiz() {
        perguntasQuiz = new ArrayList<>(List.of(
            new String[]{"Em que ano a FURIA foi fundada?", "2017"},
            new String[]{"Qual jogo popularizou a FURIA?", "cs:go"},
            new String[]{"Qual a cor principal da FURIA?", "preto"},
            new String[]{"FURIA é um time de qual país?", "brasil"}
        ));

        Collections.shuffle(perguntasQuiz); // embaralha as perguntas

        indiceQuiz = 0;
        modoQuiz = true;
        pontuacao = 0;
        scoreLabel.setText("Pontuação: 0");

        chatArea.append("Bot: 🎮 Iniciando quiz com 4 perguntas!\n");
        fazerPerguntaAtual();
    }

    private void fazerPerguntaAtual() {
        if (indiceQuiz < perguntasQuiz.size()) {
            respostaAtual = perguntasQuiz.get(indiceQuiz)[1].toLowerCase();
            chatArea.append("Pergunta " + (indiceQuiz + 1) + ": " + perguntasQuiz.get(indiceQuiz)[0] + "\n");
        }
    }

    private void avaliarResposta(String input) {
        if (input.equals(respostaAtual)) {
            chatArea.append("Bot: ✅ Resposta correta! +10 pontos\n\n");
            pontuacao += 10;
        } else {
            chatArea.append("Bot: ❌ Resposta errada. Resposta certa: " + respostaAtual + "\n\n");
        }

        indiceQuiz++;

        if (indiceQuiz < perguntasQuiz.size()) {
            fazerPerguntaAtual();
        } else {
            modoQuiz = false;
            chatArea.append("🎉 Fim do quiz! Sua pontuação final: " + pontuacao + " pontos.\n\n");
            atualizarPontuacao();
        }
    }

    private void atualizarPontuacao() {
        scoreLabel.setText("Pontuação: " + pontuacao);
    }

    private void mostrarEstatisticas() {
        chatArea.append("Bot (Estatísticas):\n");
        chatArea.append("- Vitórias em 2024: 18\n");
        chatArea.append("- Derrotas em 2024: 7\n");
        chatArea.append("- Winrate: 72%\n");
        chatArea.append("- Jogador destaque: KSCERATO\n\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatFuriaGUI::new);
    }
}
