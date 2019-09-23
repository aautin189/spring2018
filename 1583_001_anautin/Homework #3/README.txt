

Abby Autin

DATE: March 7, 2018
COURSE: Java I		


ASSIGNMENT:
Homework #3
Combat Game


**************************************************

Overview: 
- user creates a hero character, prioritizing certain attributes over others (input)
- once hero is created, a specific monster is chosen out of 3 available monster types; selection is based on random number generated using external method
- the combat loop begins

- once in the combat loop, the hero is provided a list of attack options
- hero stats & monster stats should be displayed to user 
- user makes a selection
- based on selection, associated attributes (for both monster and hero) are updated accordingly
- after hero action is executed, the selected monster will "attack" the hero character 
- the effect of the attack will directly decrease the hero's health (by a randomly generated amount)
- the user will then receive an alert of the attack

- the combat loop will continue to execute UNTIL the monster dies, the hero dies, or the hero flees the game willingly

**************************************************

> IMPORTED CLASSES
** java.util.Scanner
** java.security.SecureRandom




> CLASS OBJECTS
** new SecureRandom (object) to generate random numbers




> CLASS VARIABLES
** attributes for the hero character
** attributes for the monster character




> CLASS ENUM
** Coward {YEP,NOPE} - used as a loop control variable that will terminate the combat loop if user chooses to flee from the game


**************************************************

Section #1

1) METHOD: main

----> INVOKE: buildYourHero method
----> INVOKE: buildYourMonster method


----> LOOP: only INVOKE runCombat method if hero is alive, monster is alive, and hero hasn't run away


**************************************************

Section #2

2) METHOD: buildYourOwnHero

----> WHILE LOOP: provides 20 points to user; user increases one of three attributes for each point in allocation (until the allocation is empty)
----> SWITCH STATEMENT: decreases pointAllocation & increases selected attribute (based on user input)
----> After each loop, display running totals for each hero attribute

**************************************************

Section #3

3) METHOD: buildYourMonster

----> RANDOM: produce a random number that will be used in the switch statement condition
----> SWITCH STATEMENT: based on value of the random-number-generator, select corresponding monster profile
----> DISPLAY: notify user as to which type of monster they've entered combat with


**************************************************


Section #4

4) METHOD: runCombat 

----> INVOKE: method = display the selected monster's stats that will be used in combat
----> INVOKE: method = display the hero's stats that were purchased during the hero-creation
----> DISPLAY: show the user the combat options available to use on the selected monster
----> SELECTION STATEMENT: based on user input, INVOKE (1 of 4) corresponding assistant-methods that will carry out the processes required


5) METHOD: displayMonsterStats

----> DISPLAY


6) METHOD: displayHeroStats 

----> DISPLAY



7) METHOD: swordAttackOption

----> INVOKE: when this method is invoked, it should produce a random # (1-hero's attack power). 
----> Then, deduct that number from the monster's health to reflect the damage
----> DISPLAY: present an alert message to the user, showing him/her the effects of the attack on the monster

----> IF STATEMENT: (monster is still alive), INVOKE monsterRetaliation method to calculate damage inflicted on hero



8) METHOD: monsterRetaliation

----> IF STATEMENT: (monsterHealth > 0)
----> produce a RANDOM number (1-monsterAttackPower) that will represent the damage the monster inflicted on the hero. Then, deduct those points from the hero's health

----> DISPLAY: present a 2nd alert message to the user, letting him/her know they had been attacked by the monster



9) METHOD: spellOption

----> IF STATEMENT: (hero has enough mana to cast the spell)
----> reduce hero's magic power by 3 points
----> divide monsterHealth by 2
----> display notification to the player that he/she has successfully cast a spell on the monster
----> ELSE: DISPLAY a message to the player that he/she does not have enough mana available to cast a spell


----> INVOKE: monsterRetaliation method to calculate damage inflicted on hero



10) METHOD: chargeMagicOption

----> PROCESS: increase heroMagicPower by 3 points
----> DISPLAY: message to player notifying him/her that the hero has chosen to charge his/her mana
----> INVOKE: monsterRetaliation method to calculate damage inflicted on hero




11) METHOD: fleeOption


----> ASSIGN: set loop control variable (Coward) == YEP to terminate combat loop
----> DISPLAY: message notifying the player that the hero chose to run away and lost the game








