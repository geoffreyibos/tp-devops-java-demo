# TP DevOps Java Demo

Petit projet Java/Maven prêt à être utilisé dans un TP DevOps avec GitHub, Jenkins, SonarQube et Nexus.

## Contenu

- Application Java simple : `Calculator`
- Tests unitaires JUnit 5
- Rapport de couverture JaCoCo
- `Jenkinsfile` pour pipeline Jenkins
- Workflow GitHub Actions
- Configuration SonarQube
- Configuration Maven pour publier vers Nexus

## Commandes utiles

Compiler et lancer les tests :

```bash
mvn clean test
```

Compiler, tester et générer la couverture :

```bash
mvn clean verify
```

Lancer l'application :

```bash
mvn -q exec:java -Dexec.mainClass=fr.efrei.devops.App
```

Analyser avec SonarQube :

```bash
mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.token=VOTRE_TOKEN
```

Publier vers Nexus :

```bash
mvn deploy
```

## Jenkins

Créer un job Pipeline connecté au dépôt GitHub, puis utiliser le fichier `Jenkinsfile`.

Identifiants Jenkins attendus :

- `sonar-host-url` : URL SonarQube, par exemple `http://localhost:9000`
- `sonar-token` : token SonarQube

Outils Jenkins attendus :

- `Maven`
- `JDK17`

Pour publier dans Nexus, configurer les identifiants Maven dans `settings.xml` avec les ids :

- `nexus-snapshots`
- `nexus-releases`

Les URLs sont lues depuis :

- `NEXUS_SNAPSHOT_URL`
- `NEXUS_RELEASE_URL`

## GitHub

Initialiser le dépôt local :

```bash
git init
git add .
git commit -m "Initial Maven DevOps demo project"
```

Puis créer un dépôt GitHub et pousser :

```bash
git branch -M main
git remote add origin https://github.com/VOTRE_COMPTE/tp-devops-java-demo.git
git push -u origin main
```
