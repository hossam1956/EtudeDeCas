# EtudeDeCas

EtudeDeCas est une application Java basée sur Spring Boot. Elle utilise une architecture modulaire et des technologies modernes telles que gRPC, GraphQL, REST, SOAP, et des outils de supervision comme Prometheus et Grafana. Ce projet vise à fournir une solution complète pour la gestion des réservations avec des fonctionnalités robustes et des performances optimales.

## Fonctionnalités principales
- **REST API** : Fournie par Spring Boot.
- **GraphQL API** : Pour des requêtes flexibles et optimisées.
- **gRPC** : Pour des communications rapides et basées sur Protobuf.
- **SOAP Services** : Implémentés via Apache CXF.
- **Surveillance** : Intégration de Prometheus et Grafana pour la supervision des performances.

## Prérequis
- **Java** : Version 21
- **Maven** : Pour la gestion des dépendances et la construction du projet

## Dépendances principales

| Technologie            | Version      |
|------------------------|--------------|
| Spring Boot           | 3.4.0        |
| GraphQL (Spring Boot) | Intégré      |
| gRPC                  | 1.53.0       |
| Protobuf              | 3.22.0       |
| SOAP (Apache CXF)     | 4.0.2        |
| Prometheus (Micrometer)| Dernière     |

## Structure du projet
- **src/main/java**
  - **conf** : Configuration du framework CXF.
  - **controller** : Contient les contrôleurs REST et GraphQL.
  - **service** : Implémentation des services (REST, gRPC, SOAP).
  - **dto** : Contient les objets de transfert de données pour structurer les échanges entre les différentes couches de l'application.
  - **entities** : Contient les entités représentant les modèles persistants dans la base de données.
  - **exceptions** : Inclut le gestionnaire d'exceptions pour GraphQL (GraphQLExceptionHandler).
  - **monitor** : Contient les configurations pour Prometheus et Grafana afin de surveiller l'application (docker-compose.yml, prometheus.yml, datasources.yml).
  - **stubs** : Contient les artefacts générés automatiquement pour gRPC.
  - **EtudeDeCasApplication** : Classe principale pour démarrer l'application.

- **src/main/resources**
  - **graphql** : Contient les schémas pour les requêtes GraphQL.
  - **static** : Ressources statiques comme des fichiers CSS, JS ou images.
  - **templates** : Fichiers de template pour générer des vues dynamiques.
  - **application.properties** : Configuration principale pour Spring Boot.
  - **reservation.proto** : Définitions Protobuf pour gRPC.

## Instructions pour l'exécution
1. Assurez-vous que Java 21 et Maven sont installés sur votre système.
2. Clonez le projet depuis le dépôt GitHub :
   ```bash
   git clone <url-du-repo>
   ```
3. Naviguez dans le dossier du projet :
   ```bash
   cd EtudeDeCas
   ```
4. Construisez et démarrez l'application :
   ```bash
   mvn spring-boot:run
   ```
   
## Supervision
1. Lancez les services Prometheus et Grafana :
   ```bash
   docker-compose up -d
   ```
2. Accédez à Grafana via [http://localhost:3000](http://localhost:3000) et configurez les tableaux de bord pour visualiser les métriques collectées par Prometheus.
