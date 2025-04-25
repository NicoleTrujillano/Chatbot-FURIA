# Chatbot-FURIA 💬 Challenge #1 - Experiência Conversacional FURIA

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

Chatbot interativo feito em Java com interface gráfica (JFrame), desenvolvido para os fãs do time de CS:GO FURIA. O chatbot oferece uma experiência divertida com perguntas sobre o time, sistema de pontuação e feedback visual.

---

## 🎮 Funcionalidades
- Interface amigável com botões e mensagens automáticas
- Quiz com perguntas sobre o time FURIA
- Sistema de pontuação
- Comando `jogo` — recomenda jogos do time FURIA
- Comando `curiosidade` — exibe curiosidades sobre a equipe
- Comando `ranking` — mostra o ranking da FURIA
- Comando `estatisticas` — mostra dados gerais da FURIA
- Comando `sair` — exibe uma mensagem de despedida
- Feedback visual de acertos e erros
- Fácil expansão para mais funcionalidades
  
---

## 📸 Captura de Tela
![image](https://github.com/user-attachments/assets/ad27eeeb-0af9-4b3f-84e3-fdbcd4667494)

---

## 🎬 Demonstração
📹 Vídeo de demonstração: https://youtu.be/2_VHEOePdsA?si=1judSgPty1jhBtG5

📄 Documentação detalhada com instruções de uso:
➡️ `instrucoes-de-uso.md`


---

## 🚀 Como executar

### Pré-requisitos
- Java 8 ou superior
- Eclipse ou qualquer IDE Java

### Passos
1. Clone o repositório:
```bash
git clone https://github.com/NicoleTrujillano/Chatbot-FURIA.git
```
2. Abra o projeto na sua IDE (Eclipse recomendado)
3. Compile e execute a classe `ChatFuriaGUI.java`

---

## 🧠 Comandos disponíveis no Chatbot

Digite um dos seguintes comandos no campo de texto da interface:

| Comando       | Função                                                      |
|---------------|-------------------------------------------------------------|
| `quiz`        | Inicia o quiz com perguntas sobre o time FURIA              |
| `jogo`        | Recomenda um jogo da FURIA                                  |
| `curiosidade` | Mostra uma curiosidade aleatória sobre o time               |
| `ranking`     | Exibe o ranking do time                                     |
| `estatisticas`| Mostra estatísticas gerais da equipe FURIA                  |
| `sair`        | Mostra uma mensagem de despedida                            |

---

## 📄 Adicionando novas perguntas ao quiz

Você pode adicionar perguntas diretamente na classe `Quiz.java`, em uma lista como esta:

```java
perguntas.add(new Pergunta("Qual jogador é o capitão da FURIA?", "art", new String[]{"art", "KSCERATO", "yuurih"}));
```

---

## 🤝 Contribuições

Sinta-se à vontade para sugerir melhorias, novas perguntas, ou expandir o chatbot com novas funcionalidades.

---

## ✍️ Autora
Nicole Trujillano
[LinkedIn](https://www.linkedin.com/in/nicole-trujillano-292aa4358/)

---

## 🇺🇸 English Description

Interactive chatbot built in Java with a graphical interface (JFrame), designed for fans of the CS:GO team FURIA. It provides a fun experience with team-related quiz questions, a scoring system, and visual feedback.
