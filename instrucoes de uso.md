# 🐾 Chatbot-FURIA

Chatbot interativo desenvolvido em **Java** com interface gráfica (**JFrame**), criado para os fãs do time de CS:GO **FURIA**.  
O sistema oferece comandos temáticos, um **quiz divertido**, sistema de **pontuação**, **estatísticas** e **curiosidades** do time.

---

## 🖥️ Tecnologias utilizadas

- Java (JDK 8 ou superior)
- Swing (JFrame para GUI)
- IDE recomendada: IntelliJ IDEA ou Eclipse

---

## 📦 Funcionalidades

- Interface amigável com botões e mensagens automáticas
- Quiz com perguntas sobre o time FURIA
- Sistema de pontuação
- Comando `jogo` — recomenda jogos do time FURIA
- Comando `curiosidade` — exibe curiosidades sobre a equipe
- Comando `ranking` — simula ou exibe pontuação dos usuários
- Comando `estatisticas` — mostra dados gerais da FURIA
- Comando `sair` — fecha o chatbot
- Feedback visual de acertos e erros
- Fácil expansão para mais funcionalidades

---

## 🚀 Como executar o projeto

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/Chatbot-FURIA.git
```

### 2. Importe o projeto para sua IDE
Abra o projeto no IntelliJ, Eclipse ou outra IDE Java de sua preferência.

### 3. Compile e execute
Execute a classe principal (ex: `ChatbotFuria.java`).  
A interface gráfica será carregada com a área de interação.

---

## 🧠 Comandos disponíveis no Chatbot

Digite um dos seguintes comandos no campo de texto da interface:

| Comando       | Função                                                      |
|---------------|-------------------------------------------------------------|
| `quiz`        | Inicia o quiz com perguntas sobre o time FURIA              |
| `jogo`        | Recomenda um jogo marcante da FURIA                         |
| `curiosidade` | Mostra uma curiosidade aleatória sobre o time               |
| `ranking`     | Exibe o ranking ou pontuação acumulada                      |
| `estatisticas`| Mostra estatísticas gerais da equipe FURIA                  |
| `sair`        | Encerra o chatbot                                           |

---

## 🛠️ Estrutura do Projeto

```
Chatbot-FURIA/
├── src/
│   ├── ChatbotFuria.java         # Interface gráfica e lógica do chatbot
│   ├── Quiz.java                 # Lógica do quiz
│   └── Pergunta.java             # Classe de perguntas e respostas
├── README.md
└── assets/                       # (opcional) imagens, ícones etc.
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

---

## 🏆 Desafio

Este projeto foi desenvolvido como parte do **Challenge #1 – Imersão FURIA 2024**.

---

## 📫 Contato

Feito com 💜 por [Seu Nome]  
GitHub: [https://github.com/seu-usuario](https://github.com/seu-usuario)  
Email: [seu.email@email.com]
