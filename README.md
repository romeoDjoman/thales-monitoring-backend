### **Titre du Projet**
**Monitoring et Analyse de Production**

---

### **Description**
Ce projet est une application web full-stack développée pour surveiller et analyser les performances des lignes de production en temps réel. L'application permet de gérer les équipements (capteurs et bancs de test), de collecter des données en temps réel, de visualiser les performances via des graphiques dynamiques, et de générer des rapports statistiques.

L'application est composée de :
- Un **backend** développé avec **Spring Boot** (Java) pour la gestion des données et la logique métier.
- Un **frontend** développé avec **Angular** (TypeScript) pour l'interface utilisateur.
- Une base de données **MySQL** pour le stockage des données.

---

### **Fonctionnalités**
- **Gestion des équipements** : Ajout, modification, suppression et consultation des capteurs et bancs de test.
- **Collecte de données en temps réel** : Intégration d'une API REST pour récupérer les données des capteurs de production.
- **Visualisation des performances** : Dashboard avec des graphiques dynamiques (utilisant **Chart.js**) pour suivre les indicateurs clés.
- **Analyse et alertes** : Détection d'anomalies et notifications en cas de dysfonctionnement.
- **Génération de rapports** : Stockage des données et génération de rapports statistiques.

---

### **Technologies Utilisées**
- **Backend** :
  - **Spring Boot** : Framework Java pour le développement d'API REST.
  - **Spring Data JPA** : Gestion des entités et des relations avec la base de données.
  - **MySQL** : Base de données relationnelle pour le stockage des données.
  - **Docker** : Conteneurisation de l'application pour un déploiement facile.

- **Frontend** :
  - **Angular** : Framework TypeScript pour le développement d'interfaces utilisateur dynamiques.
  - **Tailwind CSS** : Framework CSS pour un design moderne et réactif.
  - **Chart.js** : Bibliothèque JavaScript pour la création de graphiques dynamiques.
  - **Reactive Forms** : Gestion des formulaires de manière réactive.

---

### **Installation et Configuration**
#### **Backend**
1. Cloner le repository :
   ```bash
   git clone https://github.com/ton-utilisateur/monitoringBackend.git
   ```
2. Configurer la base de données :
   - Créer une base de données MySQL nommée `monitoring_db`.
   - Mettre à jour les informations de connexion dans `application.properties`.
3. Lancer l'application :
   ```bash
   mvn spring-boot:run
   ```

#### **Frontend**
1. Cloner le repository :
   ```bash
   git clone https://github.com/ton-utilisateur/monitoringFrontend.git
   ```
2. Installer les dépendances :
   ```bash
   npm install
   ```
3. Lancer l'application :
   ```bash
   ng serve
   ```

#### **Docker**
1. Construire l'image Docker :
   ```bash
   docker build -t monitoringbackend .
   ```
2. Lancer les conteneurs avec Docker Compose :
   ```bash
   docker-compose up
   ```

---

### **Structure du Projet**
- **Backend** :
  - `src/main/java/com/monitoring` : Contient les contrôleurs, services, et entités.
  - `src/main/resources` : Contient les fichiers de configuration (comme `application.properties`).
  - `Dockerfile` : Fichier de configuration pour Docker.

- **Frontend** :
  - `src/app` : Contient les composants Angular, services, et modules.
  - `src/assets` : Contient les ressources statiques (images, styles, etc.).
  - `proxy.conf.json` : Fichier de configuration du proxy pour Angular.

---

### **Auteurs**
- [[Roméo DJOMAN](https://github.com/ton-utilisateur)](https://github.com/romeoDjoman)

---


---

### **Capture d'écran *

---

### **Contribuer**
Les contributions sont les bienvenues ! Si tu souhaites contribuer au projet, suis les étapes suivantes :
1. Fork le projet.
2. Crée une branche pour ta fonctionnalité (`git checkout -b feature/NouvelleFonctionnalité`).
3. Commit tes changements (`git commit -m 'Ajouter une nouvelle fonctionnalité'`).
4. Push vers la branche (`git push origin feature/NouvelleFonctionnalité`).
5. Ouvre une Pull Request.

---

### **Remerciements**
- Merci à [Spring Boot](https://spring.io/projects/spring-boot) et [Angular](https://angular.io/) pour leurs frameworks incroyables.
- Merci à [Tailwind CSS](https://tailwindcss.com/) pour les styles modernes.

---
