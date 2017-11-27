# Game Requirements

  An RPG with the following mechanics:

    **Iteration 1**
    *Basic mechanics*

      * Turn based. Multiple players play, Only one player plays at a time.

      * Each player controls a team of units on the grid. A player's entire team
        has the opportunity to move during a turn. Each unit gets one move per
        turn.

      * Play takes place on a 2 dimensional grid. Only one unit per space.

      * Play continues until a win or lose criteria is satisfied.

      * The beginning of playing on a board to finish is a level.

      * Each unit comprising a team has a set of stats determining their
        battle performance. These stats include:

          - HP (Health. Unit dies if health goes to zero.)
          - Phys Atk. (powers base damage with a physical weapon)
          - Mag (powers base damage with magic weapons)
          - Def (Decreases damage taken by physical attacks)
          - Mag Def (Decreases damage taken by magical attacks)
          - Spd (Determines Evasion & Determines number of attacks)
          - Intelligence (Effects crit, evasion, level up)
          - Skill (Effects hit, range of certain attacks)
          - Movement (Number of spaces that can be moved)


      * Two Unit Types: Magic User, Physical Fighter. Each has a one range
        attack with the following formulas:

          1. Default Physical attack:
            Hit rate: (bounded between 1, and 99)
              Intelligence + 4 * Skill - Opponents(Speed + Intelligence))
            Damage: Phys Atk - Opponents(Def)

          2. Default Magical attack:
            Hit rate: (bounded between 1, and 99)
              Intelligence + 4 * Skill - Opponents(Speed + Intelligence))
            Damage: Mag - Opponents(Mag Def)

      * Units can move as many spaces as their movement allows them to.
        They cannot move through enemy units.

    **Iteration 2**
    *Basic Rendering with Swing*

    **Iteration 3**
    *Draw shapes*

    **Iteration 4**
    *More Complicated Mechanics*
      * Each unit has a default attack based on their weapon/class:
