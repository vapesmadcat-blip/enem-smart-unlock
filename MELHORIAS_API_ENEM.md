# Integração da API ENEM

A tela de bloqueio agora consulta `https://api.enem.dev/v1/exams/2023/questions` antes de iniciar o desafio. A resposta é lida no envelope `metadata/questions` documentado pela API, e cada item é normalizado para o modelo interno do aplicativo.

Somente questões com **cinco alternativas preenchidas (A–E)** e gabarito válido são aceitas. Questões incompletas ou sem gabarito confiável são descartadas para evitar respostas incorretas. O carregamento tem timeout curto e, em caso de indisponibilidade da rede, usa o banco local sem interromper o estudo; as questões locais também são completadas para manter cinco opções na interface.

A API é uma fonte pública comunitária, sem chave de acesso. O app informa na tela se a questão veio da **API ENEM** ou do **Banco local**.

## Validação

A API foi consultada durante a implementação e retornou questões de 2023 com cinco alternativas e gabarito A–E. A compilação local não foi concluída neste sandbox porque o ambiente não possui Android SDK; o projeto continua pronto para compilação pelo workflow de APK/Android Studio do repositório.
