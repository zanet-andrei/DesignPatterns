### Exercice 2

Une entreprise de services propose à ses clients plusieurs catégories
d’abonnement, chaque abonnement donnant accès à plusieurs services.
Un client ne peut acheter qu'un seul abonnement et a accès aux services
correspondants.

### Quel Design Pattern vous aiderait à permettre les accès aux services auxquels ont droit les clients ?

Les mêmes services peuvent être partagés entre plusieurs abonnements. Il faut permettre à chaque abonnement de faire varier
ses services indépendamment des autres abonnements. Strategy Pattern?

Soit ça, soit le Composite Pattern, car un abonnement peut être composé de plusieurs services et on peut voir chaque abonnement
comme une espèce d'hiérarchie?

### Donnez le diagramme de classes adapté à ce cas.

https://web.goodnotes.com/s/PguFoCUnzYyNEzKlqx3qsF