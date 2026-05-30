# CriaturaHub — Roadmap Resumido

> Grade completa da Jornada do Caçador, do Recruta ao Mestre Caçador.
> Documento vivo: atualizado conforme a Jornada avança.
> Convenção: `[✓]` concluída · `[→]` atual · `[ ]` pendente · `[opc]` opcional.

---

## Estrutura

- 5 Fases, cada uma com sua patente
- Cada Fase tem Capítulos temáticos (A, B, C...)
- Cada Capítulo tem Missões numeradas (X.Y.N)
- Cada Missão = 1 sessão de 45-60min, 1 PDF curto

**Ritmo de referência:** 4 ativas/semana (seg, ter, qui, sex)
+ qua e sáb consolidação opcional + dom OFF.

**Início da Jornada reformulada:** 15/05/2026.
**Total estimado:** 47 missões em ~12 semanas.
**Marco de candidatura:** fim da Fase 3 — previsto para 24/07/2026.
**App completo:** fim da Fase 4 — previsto para 07/08/2026.

> Datas são previsão, não dívida. Atrasos de até uma semana são normais
> e não exigem recalibragem. Acima disso, conversar com o Claude.

---

## FASE 0 — Forja do Caçador
**Patente: Recruta · 5 missões · 15-21/05/2026**

Objetivo: ambiente pronto, Kotlin mínimo, primeiro app rodando.

### Capítulo 0.A — Ambiente pronto
- [✓] **0.A.1** — Android Studio, JDK 21, emulador, Git, repo `criaturahub` criado

### Capítulo 0.B — Primeiras palavras de Kotlin
- [✓] **0.B.1** — `val`, `var`, tipos básicos, inferência, templates, `println` · **sex 15/05**
- [✓] **0.B.2** — Funções (declaração, parâmetros, retorno), `if/else` como comando e expressão · **seg 18/05**

### Capítulo 0.C — Primeiro pergaminho na tela
- [✓] **0.C.1** — Anatomia de projeto Android, primeira modificação no app · **ter 19/05**
- [✓] **0.C.2** — "Olá, Guilda": tela com TextView e Button reativo · **qui 21/05**

**Marco fim Fase 0:** app rodando no emulador, código no Git, Kotlin básico na mão.

---

## FASE 1 — Catálogo da Guilda
**Patente: Caçador Júnior · 14 missões · 22/05 a 18/06/2026**

Objetivo: app que consome PokéAPI, mostra lista com imagens, navega pra detalhe.

### Capítulo 1.A — Listas e classes
- [✓] **1.A.1** — `List<T>`: criar, acessar, iterar com `for`, no Playground · **sex 22/05**
- [✓] **1.A.2** — Classes simples com construtor primário · **seg 25/05**

### Capítulo 1.B — Mostrando lista na tela
- [✓] **1.B.1** — Conceito de RecyclerView, Adapter, ViewHolder · **ter 26/05**
- [✓] **1.B.2** — Layout XML do item da lista · **qui 28/05**
- [✓] **1.B.3** — Adapter mínimo com lista hardcoded de 5 criaturas · **sex 29/05**
- [✓] **1.B.4** — Polir item: dois TextViews, espaçamento, divisor · **seg 01/06**

### Capítulo 1.C — Tela de detalhe
- [✓] **1.C.1** — Activity vs Fragment, Navigation Component (alto nível) · **ter 02/06**
- [✓] **1.C.2** — Setup Navigation, primeira tela migrada para Fragment · **qui 04/06**
- [✓] **1.C.3** — Click na lista navega para detalhe com argumento · **sex 05/06**

### Capítulo 1.D — Conexão com a Guilda Antiga (PokéAPI)
- [✓] **1.D.1** — `data class` e `copy` modelando resposta JSON · **seg 08/06**
- [ ] **1.D.2** — Corrotinas básicas: `suspend`, `launch`, conceito de "código que demora" · **ter 09/06**
- [ ] **1.D.3** — Retrofit: setup, primeiro GET com Log · **qui 11/06**
- [ ] **1.D.4** — `ViewModel` e `StateFlow` (apresentando **MVVM** por nome) · **sex 12/06**
- [opc] **1.D.5** — LiveData: o que é, quando aparece em código legado · **sáb 13/06 (opcional)**

### Capítulo 1.E — Costurando tudo
- [ ] **1.E.1** — Lista real da PokéAPI substitui hardcoded · **seg 15/06**
- [ ] **1.E.2** — Tela de detalhe consumindo endpoint específico, ImageView com Coil · **ter 16/06**
- [ ] **1.E.3** — Estados de loading e erro · **qui 18/06**

**Marco fim Fase 1:** app que abre, busca PokéAPI, mostra com imagens, navega para detalhe.

---

## FASE 2 — Mochila do Caçador
**Patente: Caçador · 10 missões · 19/06 a 06/07/2026**

Objetivo: UI migrada para Compose, persistência local com Room, mochila offline.

### Capítulo 2.A — Compose como nova ferramenta de UI
- [ ] **2.A.1** — Por que Compose, primeiro `@Composable` · **sex 19/06**
- [ ] **2.A.2** — `Text`, `Button`, `Column`, `Row`, `Modifier` · **seg 22/06**
- [ ] **2.A.3** — `LazyColumn`: catálogo em Compose · **ter 23/06**
- [ ] **2.A.4** — Tela de detalhe em Compose · **qui 25/06**

### Capítulo 2.B — Persistência local com Room
- [ ] **2.B.1** — Conceito de Room, setup · **sex 26/06**
- [ ] **2.B.2** — Entidade, DAO básico (insert, getAll, delete) · **seg 29/06**
- [ ] **2.B.3** — Database singleton, primeira inserção testada · **ter 30/06**

### Capítulo 2.C — Mochila viva
- [ ] **2.C.1** — Padrão **Repository** (complementando MVVM) · **qui 02/07**
- [ ] **2.C.2** — Botão "Capturar" insere no Room · **sex 03/07**
- [ ] **2.C.3** — Tela da mochila com botão "Soltar" (delete) · **seg 06/07**

**Marco fim Fase 2:** UI 100% Compose, persistência local, app usável offline.

---

## FASE 3 — Liga de Batalha
**Patente: Caçador Sênior · 10 missões · 07/07 a 24/07/2026**

Objetivo: lógica de batalha, cobertura por testes, princípios SOLID em prática.
**App candidatável ao fim desta Fase.**

### Capítulo 3.A — Lambdas, coleções, ferramentas Kotlin
- [ ] **3.A.1** — Lambdas: sintaxe `{ x -> ... }` e motivação · **ter 07/07**
- [ ] **3.A.2** — `map`, `filter`, `forEach` aplicados à mochila · **qui 09/07**
- [ ] **3.A.3** — `sealed class`: tipos de resultado de batalha · **sex 10/07**

### Capítulo 3.B — Lógica de domínio (com SOLID embutido)
- [ ] **3.B.1** — `vantagemDeTipo` com `when` (toca em Single Responsibility) · **seg 13/07**
- [ ] **3.B.2** — `calcularDano` (toca em Open/Closed) · **ter 14/07**
- [ ] **3.B.3** — `simularTurno` retorna estado novo · **qui 16/07**

### Capítulo 3.C — Testes unitários
- [ ] **3.C.1** — JUnit: primeiro teste. Anatomia: Given/When/Then · **sex 17/07**
- [ ] **3.C.2** — Bateria de testes: 10+ casos · **seg 20/07**
- [ ] **3.C.3** — Mockito: mock simples do Repository · **ter 21/07**

### Capítulo 3.D — Liga jogável
- [ ] **3.D.1** — Tela "Montar Time": seleciona até 6 da mochila · **qui 23/07**
- [ ] **3.D.2** — Tela "Batalha": simulação textual turno a turno · **sex 24/07**

**Marco fim Fase 3 — 24/07/2026: CANDIDATÁVEL.**
App com batalha funcional, testes provando lógica, vocabulário (MVVM, Repository,
SOLID, Coroutines, Flow, Compose, Retrofit, Room, JUnit) ativo.

---

## FASE 4 — Hall da Fama
**Patente: Mestre Caçador · 8 missões · 27/07 a 07/08/2026**

Objetivo: polimento, testes de UI, vivência profissional, distribuição.

### Capítulo 4.A — Testes de UI
- [ ] **4.A.1** — Compose UI Test: primeiro teste de tela · **seg 27/07**
- [ ] **4.A.2** — Fluxo principal coberto: abrir, capturar, ver na mochila · **ter 28/07**

### Capítulo 4.B — Polimento e profissionalismo
- [ ] **4.B.1** — Empty/loading/error states em todas as telas · **qui 30/07**
- [ ] **4.B.2** — Dark mode próprio do app, ícone customizado · **sex 31/07**
- [ ] **4.B.3** — Tela "Sobre" com versão e créditos · **seg 03/08**
- [ ] **4.B.4** — **Vivência profissional**: GitHub Projects com Kanban,
                   issues, PRs próprios, code-review-de-si-mesmo · **ter 04/08**

### Capítulo 4.C — Distribuição
- [ ] **4.C.1** — README profissional com stack alinhada a vagas · **qui 06/08**
- [ ] **4.C.2** — APK assinado, release no GitHub · **sex 07/08**

**Marco final — 07/08/2026:** CriaturaHub completo, distribuído, candidatável
a qualquer vaga júnior em Android.

---

## Resumo numérico

| Fase | Patente             | Missões | Início      | Fim         |
|------|---------------------|---------|-------------|-------------|
| 0    | Recruta             | 5 (1✓)  | 15/05/2026  | 21/05/2026  |
| 1    | Caçador Júnior      | 14      | 22/05/2026  | 18/06/2026  |
| 2    | Caçador             | 10      | 19/06/2026  | 06/07/2026  |
| 3    | Caçador Sênior      | 10      | 07/07/2026  | 24/07/2026  |
| 4    | Mestre Caçador      | 8       | 27/07/2026  | 07/08/2026  |
| **Total** | —              | **47**  | **15/05**   | **07/08**   |

**Marco candidatura:** 24/07/2026 (~10 semanas)
**Marco app completo:** 07/08/2026 (~12 semanas)

---

## Stack final do CriaturaHub (vocabulário pra job description)

- **Linguagem:** Kotlin
- **UI:** Jetpack Compose, Material 3
- **Arquitetura:** MVVM com Repository Pattern
- **Princípios:** SOLID (Single Responsibility, Open/Closed em prática)
- **Assincronia:** Kotlin Coroutines + StateFlow
- **Rede:** Retrofit + Coil (imagens)
- **Persistência:** Room (SQLite)
- **Navegação:** Navigation Component
- **Testes:** JUnit, Mockito, Compose UI Test
- **Controle de versão:** Git + GitHub (Issues, Projects/Kanban, PRs)
- **Distribuição:** APK assinado, GitHub Releases

---

## Fora de escopo (decisão consciente)

Itens que aparecem em algumas vagas mas não entram no roadmap atual.
Cobrir todos diluiria foco e arrastaria o cronograma.

- **C/C++** (algumas vagas de telecom e IA embarcada)
- **Machine Learning embarcado** (TensorFlow Lite, etc.)
- **MVI/MVP/MVC** (foco em MVVM; outros padrões são variações)
- **Hilt/Dagger/Koin** (injeção de dependência manual no escopo atual)
- **Firebase** (não usado no CriaturaHub)
- **RxJava/RxKotlin** (substituído por Flow no Android moderno)
- **Inglês técnico** (skill paralela, treinada fora do projeto)

Se uma vaga específica exigir um destes itens, plano-relâmpago de 1-2 semanas
de imersão **depois** do CriaturaHub completo é mais eficiente que tentar
encaixar agora.

---

## Convenções

- **Pré-requisito:** cada PDF de missão lista no topo o que precisa estar concluído antes.
- **Sequencial:** missões seguem ordem estrita dentro de cada Fase.
- **Replanejamento:** missão densa demais vira duas (X.Y.Na e X.Y.Nb) sem culpa.
- **Marcar progresso:** atualizar `[✓]` ao fim de cada missão, `[→]` na atual.
- **Atraso:** até uma semana acima do previsto é normal. Acima disso, recalibrar com o Claude.
