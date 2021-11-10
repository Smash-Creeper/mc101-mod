execute as @s positioned as @s at @s run tp @e[tag=CENTER,tag=SOLAR,type=minecraft:area_effect_cloud] ~ ~-2 ~
execute as @e[tag=CENTER] at @s positioned as @s run tp @s ~ ~ ~ ~10 0

execute as @s positioned as @s at @s run tp @e[tag=EDGE1,tag=SOLAR,distance=5.1..] @s
execute as @s positioned as @s at @s run tp @e[tag=EDGE2,tag=SOLAR,distance=5.1..] @s
execute as @s positioned as @s at @s run tp @e[tag=EDGE3,tag=SOLAR,distance=5.1..] @s
execute as @s positioned as @s at @s run tp @e[tag=EDGE4,tag=SOLAR,distance=5.1..] @s

execute as @e[tag=CENTER] at @s positioned as @s run execute positioned ~ ~2 ~ run tp @e[tag=EDGE1,tag=SOLAR,distance=..5] ^ ^ ^0.65 ~-90 ~
execute as @e[tag=CENTER] at @s positioned as @s run execute positioned ~ ~2 ~ run tp @e[tag=EDGE2,tag=SOLAR,distance=..5] ^0.65 ^ ^ ~-180 ~
execute as @e[tag=CENTER] at @s positioned as @s run execute positioned ~ ~2 ~ run tp @e[tag=EDGE3,tag=SOLAR,distance=..5] ^ ^ ^-0.65 ~-270 ~
execute as @e[tag=CENTER] at @s positioned as @s run execute positioned ~ ~2 ~ run tp @e[tag=EDGE4,tag=SOLAR,distance=..5] ^-0.65 ^ ^ ~0 ~

effect give @s resistance 2 4 true