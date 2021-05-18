Bonjour et bienvenue! Veuillez vous assurer de lire attentivement toutes les pièces.
Pour le devoir 03, vous créerez une reconstitution du jeu Battleship, où deux joueurs choisiront l'emplacement des navires sur un plateau 
et tenteront de couler les navires de l'autre joueur en choisissant les coordonnées sur lesquelles tirer.
Description de la solution
Votre programme doit s'appeler Battleship. Veuillez lire toutes les étapes et examiner attentivement l'exemple de sortie avant de commencer. 
Il doit fonctionner comme suit:

Imprimez le message Bienvenue sur Battleship!
Invitez chaque utilisateur à entrer les coordonnées des cinq navires de longueur un. Il doit y avoir cinq invites distinctes pour 
chaque navire (utilisez l'exemple ci-dessous comme guide). Vous pouvez vous attendre à ce que l'entrée utilisateur soit de deux 
entiers séparés par un espace. Le premier int représente le numéro de ligne et le second int représente le numéro de colonne.
Si l'utilisateur entre des entiers non valides, imprimez Coordonnées invalides. Choisissez différentes coordonnées.
Si l'utilisateur entre une coordonnée qu'il avait déjà saisie, imprimez-Vous avez déjà un navire là-bas. Choisissez différentes coordonnées.
Une fois que chaque joueur a entré sa cinquième coordonnée, un tableau représentant les emplacements du vaisseau du joueur doit être
imprimé sur la console en utilisant la méthode fournie. Reportez-vous à la troisième étape pour savoir comment construire ces tableaux
de localisation.
100 nouvelles lignes doivent suivre le tableau imprimé pour que l'autre joueur ne voie pas les coordonnées et le tableau saisis 
de son adversaire.
Créez deux grilles 5×5 sous forme de tableaux 2D en utilisant les coordonnées saisies par les joueurs. Ces tableaux de localisation 
stockent les emplacements des navires de chaque joueur et seront utilisés pour garder une trace des états de dégâts des navires de 
chaque joueur, ainsi que de tout échec. Le tableau de localisation correspondant doit être imprimé sur la console juste après qu'un 
joueur entre les coordonnées de ses navires.
Un caractère «-» doit représenter un espace vide.
Un caractère «@» doit représenter un navire qui n'est pas touché. Lorsque le jeu commence, tous les vaisseaux recommenceront à zéro sans toucher.
Un caractère «X» représentera un espace avec un navire qui a été touché.
Un caractère «O» représentera un espace sur lequel on a tiré, mais comme il n'y a pas de vaisseau à cet endroit, le tir a été raté.
Le plateau de chaque joueur doit avoir cinq navires de longueur un. Cinq des 25 cases de la grille commenceront avec des navires dessus.
De plus, vous devez générer deux autres grilles 5×5 sous la forme de tableaux 2D. Ces tableaux d'historique des cibles permettront à chaque
joueur de suivre visuellement ses succès et ses échecs. Après chaque coup ou échec du joueur, son tableau d'historique cible doit être 
imprimé sur la console en utilisant la méthode fournie. Sur ce plateau, un caractère «X» doit représenter une touche du joueur,
un caractère «O» doit représenter un échec du joueur, et un caractère «-» doit représenter une case qui n’a pas été attaquée.
Invitez le joueur 1 à entrer une coordonnée sur laquelle tirer. Vous pouvez vous attendre à ce que l'entrée utilisateur soit de deux entiers
séparés par un espace. Si l'utilisateur entre des entiers non valides, imprimez Coordonnées invalides. Choisissez différentes coordonnées.
Si l'utilisateur entre une coordonnée qu'il a déjà entrée, imprimez ce qui suit Vous avez déjà tiré sur cet endroit. 
Choisissez différentes coordonnées. Si l’utilisateur entre une coordonnée sans vaisseau, imprimez ce qui suit et imprimez le tableau 
d’historique des cibles mis à jour, où [NUM] est remplacé par l’ID du joueur attaqué. JOUEUR [NUM] MANQUÉ!
Si l'utilisateur entre une coordonnée avec un vaisseau, imprimez ce qui suit et imprimez le tableau de l'historique des cibles mis à jour, 
où [NUM A] est remplacé par l'ID du joueur attaquant et [NUM B] est remplacé par l'ID du joueur attaqué. 
JOUEUR [NUM A] HIT LE BATEAU DU JOUEUR [NUM B]!
Le joueur 2 aura un tour après chaque tour que prend le joueur 1, qui fonctionnera de la même manière que les tours du joueur 1.
Lorsqu'un vaisseau est touché par un joueur, le plateau de localisation (qui suit les états de dégâts) des vaisseaux du joueur correspondant 
doit être mis à jour. Les échecs doivent également être mis à jour sur le tableau de localisation.
Le programme doit se terminer gracieusement après qu'un joueur gagne. Cela se produira lorsque tous les signes «@» sur le plateau 
de leur adversaire auront été remplacés par des symboles «X».
Immédiatement après le mouvement qui coule l'emplacement final du navire, imprimez le message suivant, où [NUM] est remplacé par
l'ID du joueur gagnant.:
JOUEUR [NUM] GAGNE! VOUS COULEZ TOUS LES NAVIRES DE VOTRE OPPOSANT!
En utilisant la méthode fournie, imprimez les tableaux de localisation des deux joueurs afin de vérifier les résultats du jeu aux joueurs. 
Le tableau de localisation du joueur 1 doit être imprimé en premier.
Dans votre solution, vous devez utiliser chacune des fonctionnalités Java suivantes au moins une fois:

Une boucle for (non compris celles utilisées dans le code fourni)
Une boucle do-while.
Remarque: Un fichier Battleship.java prédéfini sera fourni pour ce matériel. Votre code DOIT être écrit dans ce fichier. 
Le fichier comprend simplement une méthode, printBattleShip (…), qui DOIT être utilisée pour imprimer des tableaux 2D sur la console. Assurez-vous de ne pas modifier la méthode printBattleShip (...).

Remarque: pour que l'autograder s'exécute correctement, vous ne devez instancier qu'un seul objet Scanner dans la méthode principale en dehors de toute boucle ou condition.