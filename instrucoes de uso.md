# 📖 Instruções de Uso - Chatbot FURIA: Experiência Conversacional FURIA

Este documento explica, passo a passo, como utilizar o chatbot feito em Java com interface gráfica (Swing), desenvolvido para o desafio Experiência Conversacional FURIA.

---

## 🖥️ Tecnologias utilizadas

- Java (JDK 8 ou superior)
- Swing (JFrame para GUI)
- IDE recomendada: IntelliJ IDEA ou Eclipse

---

## 🚀 Como executar o projeto

### 1. Clone o repositório
```bash
https://github.com/NicoleTrujillano/Chatbot-FURIA
```

### 2. Importe o projeto para sua IDE
Abra o projeto no IntelliJ, Eclipse ou outra IDE Java de sua preferência.

### 3. Compile e execute
Execute a classe principal `ChatbotFuria.java`.  
A interface gráfica será carregada com a área de interação.

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

## 📂 Estrutura do Projeto
```
Chatbot-FURIA/
├── src/
│   └── ChatFuriaGUI.java
├── imagens/
│   └── furia_logo.png
├── instrucoes de uso.md
└── README.md
```

---

## 📄 Adicionando novas perguntas ao quiz

Você pode adicionar perguntas diretamente na classe `Quiz.java`, em uma lista como esta:

```java
perguntas.add(new Pergunta("Qual jogador é o capitão da FURIA?", "art", new String[]{"art", "KSCERATO", "yuurih"}));
```

---

## 🧪 Pré-requisitos

- Java JDK 8+ instalado
- IDE com suporte a Java

---

## 🤝 Contribuições

Sinta-se à vontade para sugerir melhorias, novas perguntas, ou expandir o chatbot com novas funcionalidades.
