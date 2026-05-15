# CriaturaHub

Companion app Android inspirado no universo Pokémon. Consome a [PokéAPI](https://pokeapi.co/) e permite catalogar criaturas, gerenciar uma mochila pessoal e simular batalhas turno a turno.

Projeto-âncora de estudo guiado em desenvolvimento Android nativo, construído ao longo de 5 fases com 47 missões.

---

## Status atual

| Fase | Foco | Situação |
|------|------|----------|
| 0 — Forja do Caçador | Ambiente e Kotlin básico | Em andamento |
| 1 — Catálogo da Guilda | PokéAPI + Listas + Navegação | Aguardando |
| 2 — Mochila do Caçador | Compose + Room | Aguardando |
| 3 — Liga de Batalha | Lógica de domínio + Testes | Aguardando |
| 4 — Hall da Fama | UI Tests + Polimento + Distribuição | Aguardando |

Grade completa: [`docs/roadmap.md`](docs/roadmap.md).

---

## Stack

- **Linguagem:** Kotlin
- **UI:** Jetpack Compose, Material 3
- **Arquitetura:** MVVM + Repository Pattern
- **Princípios:** SOLID aplicado em domínio de batalha
- **Assincronia:** Kotlin Coroutines + StateFlow
- **Rede:** Retrofit + Coil
- **Persistência:** Room (SQLite)
- **Navegação:** Navigation Component
- **Testes:** JUnit, Mockito, Compose UI Test
- **Build:** Gradle KTS

---

## Requisitos de build

- JDK 21 (Temurin recomendado)
- Android Studio Iguana ou superior
- Android SDK 34
- Min SDK 24

---

## Como rodar

```bash
git clone https://github.com/<usuario>/criaturahub.git
cd criaturahub
./gradlew assembleDebug
```

Abrir o projeto em Android Studio, selecionar emulador ou dispositivo físico com API 24+, e executar.

---

## Estrutura

```
criaturahub/
├── app/                  # Código-fonte do app
├── docs/                 # Documentação do projeto
│   └── roadmap.md        # Grade das 47 missões
└── kotlin-exercicios/    # Exercícios de Kotlin (Fases 0 e 1)
```

---

## Funcionalidades planejadas

- Catálogo de criaturas consumido em tempo real da PokéAPI
- Tela de detalhe com sprite, tipos e estatísticas
- Mochila persistente local com Room
- Sistema de batalha turno a turno com cálculo de vantagem de tipo
- Cobertura por testes unitários e de UI

---

## Licença

A definir.
