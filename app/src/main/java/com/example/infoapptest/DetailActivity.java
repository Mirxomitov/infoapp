package com.example.infoapptest;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    List<PlanetData> planets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int pos = getIntent().getIntExtra("POS", 0);
        loadData();

        TextView title = findViewById(R.id.detail_title);
        ImageView image = findViewById(R.id.detail_image);
        TextView description = findViewById(R.id.detail_description);

        title.setText(planets.get(pos).getName());
        image.setImageResource(planets.get(pos).getImageResId());
        description.setText(planets.get(pos).getDescription());

        findViewById(R.id.detail_back).setOnClickListener(v -> {
            finish();
        });
    }

    private void loadData() {
        // first planet
        planets.add(new PlanetData(R.drawable.mercury, "Mercury", "Mercury is the smallest planet in our solar system. It’s just a little bigger than Earth’s moon. It is the closest planet to the sun, but it’s actually not the hottest. Venus is hotter." +
                "Along with Venus, Earth, and Mars, Mercury is one of the rocky planets. It has a solid surface that is covered with craters. It has no atmosphere, and it doesn’t have any moons. Mercury likes to keep things simple.\n" +
                "\n" +
                "This small planet spins around slowly compared to Earth, so one day lasts a long time. Mercury takes 59 Earth days to make one full rotation. A year on Mercury goes by fast. Because it’s the closest planet to the sun, it doesn’t take very long to go all the way around. It completes one revolution around the sun in just 88 Earth days. If you lived on Mercury, you’d have a birthday every three months!\n" +
                "\n" +
                "A day on Mercury is not like a day here on Earth. For us, the sun rises and sets each and every day. Because Mercury has a slow spin and short year, it takes a long time for the sun to rise and set there. Mercury only has one sunrise every 180 Earth days! Isn't that weird?" +
                "Structure and Surface\n" +
                "Mercury is the smallest planet in our solar system.\n" +
                "Mercury is a terrestrial planet. It is small and rocky.\n" +
                "Mercury doesn't really have an atmosphere.\n" +
                "\n" +
                "Time on Mercury\n" +
                "A day on Mercury lasts 59 Earth days.\n" +
                "A year on Mercury lasts 88 Earth days.\n" +
                "\n" +
                "Mercury’s Neighbors\n" +
                "Mercury does not have any moons.\n" +
                "Mercury is the closest planet to the sun.\n" +
                "Venus is Mercury’s neighboring planet.\n" +
                "\n" +
                "Quick History\n" +
                "Mercury has been known since ancient times because it can be seen without advanced telescopes.\n" +
                "Mercury has been visited by two spacecraft: Mariner 10 and MESSENGER."));
        // second planet
        planets.add(new PlanetData(R.drawable.venus, "Venus", "Even though Venus isn't the closest planet to the Sun, it is still the hottest. It has a thick atmosphere full of the greenhouse gas carbon dioxide and clouds made of sulfuric acid. The gas traps heat and keeps Venus toasty warm. In fact, it's so hot on Venus, metals like lead would be puddles of melted liquid." +
                "Venus looks like a very active planet. It has mountains and volcanoes. Venus is similar in size to Earth. Earth is just a little bit bigger.\n" +
                "\n" +
                "Venus is unusual because it spins the opposite direction of Earth and most other planets. And its rotation is very slow. It takes about 243 Earth days to spin around just once. Because it's so close to the Sun, a year goes by fast. It takes 225 Earth days for Venus to go all the way around the Sun. That means that a day on Venus is a little longer than a year on Venus.\n" +
                "\n" +
                "Since the day and year lengths are similar, one day on Venus is not like a day on Earth. Here, the Sun rises and sets once each day. But on Venus, the Sun rises every 117 Earth days. That means the Sun rises two times during each year on Venus, even though it is still the same day on Venus! And because Venus rotates backwards, the Sun rises in the west and sets in the east.\n" +
                "\n" +
                "Just like Mercury, Venus doesn't have any moons." +
                "Structure and Surface\n" +
                "Venus is the hottest planet in our solar system.\n" +
                "Venus is a terrestrial planet. It is small and rocky.\n" +
                "Venus has a thick atmosphere. It traps heat and makes Venus very hot.\n" +
                "Venus has an active surface, including volcanoes!\n" +
                "Venus spins the opposite direction of Earth and most other planets.\n" +
                "\n" +
                "Time on Venus\n" +
                "A day on Venus lasts 243 Earth days.\n" +
                "A year on Venus lasts 225 Earth days.\n" +
                "\n" +
                "Venus's Neighbors\n" +
                "Venus does not have any moons.\n" +
                "Venus is the second planet from the Sun. That means Mercury and Earth are Venus's neighboring planets.\n" +
                "\n" +
                "Quick History\n" +
                "Venus has been known since ancient times because it can be seen easily without a telescope.\n" +
                "Venus has been visited by several spacecraft: Mariner 2, Mariner 5, Mariner 10, Pioneer Venus 1, Pioneer Venus 2, and an orbiter called Magellan.\n"));
        // third planet
        planets.add(new PlanetData(R.drawable.earth, "Earth", "Earth—our home planet—is the third planet from the Sun, and the only place we know of so far that’s inhabited by living things. It's also the only planet in our solar system with liquid water on the surface.While Earth is only the fifth largest planet in the solar system, it is the only world in our solar system with liquid water on the surface. Just slightly larger than nearby Venus, Earth is the biggest of the four planets closest to the Sun, all of which are made of rock and metal.\n" +
                "\n" +
                "Earth is the only planet in the Solar System whose English name does not come from Greek or Roman mythology. The name was taken from Old English and Germanic. It simply means \"the ground.\" There are, of course, many names for our planet in the thousands of languages spoken by the people of the third planet from the Sun."));
        planets.add(new PlanetData(R.drawable.mars, "Mars", "Mars is a cold desert world. It is half the size of Earth. Mars is sometimes called the Red Planet. It's red because of rusty iron in the ground.Like Earth, Mars has seasons, polar ice caps, volcanoes, canyons, and weather. It has a very thin atmosphere made of carbon dioxide, nitrogen, and argon.\n" +
                "\n" +
                "There are signs of ancient floods on Mars, but now water mostly exists in icy dirt and thin clouds. On some Martian hillsides, there is evidence of liquid salty water in the ground.\n" +
                "\n" +
                "Scientists want to know if Mars may have had living things in the past. They also want to know if Mars could support life now or in the future.\n" +
                "\n" +
                "a cartoon of Mars smiling, saying, I love having visitors!\n" +
                "Structure and Surface\n" +
                "Mars is a terrestrial planet. It is small and rocky.\n" +
                "Mars has a thin atmosphere.\n" +
                "Mars has an active atmosphere, but the surface of the planet is not active. Its volcanoes are dead.\n" +
                "\n" +
                "Time on Mars\n" +
                "One day on Mars lasts 24.6 hours. It is just a little longer than a day on Earth.\n" +
                "One year on Mars is 687 Earth days. It is almost twice as long as one year on Earth.\n" +
                "\n" +
                "Mars’ Neighbors\n" +
                "Mars has two moons. Their names are Phobos and Deimos.\n" +
                "Mars is the fourth planet from the Sun. That means Earth and Jupiter are Mars’ neighboring planets.\n" +
                "\n" +
                "Quick History\n" +
                "Mars has been known since ancient times because it can be seen without advanced telescopes.\n" +
                "Several missions have visited Mars. And Mars is the only planet we have sent rovers to. They drive around Mars, taking pictures and measurements."));
        planets.add(new PlanetData(R.drawable.jupiter, "Jupiter", "Jupiter is the biggest planet in our solar system. It's similar to a star, but it never got massive enough to start burning. It is covered in swirling cloud stripes. It has big storms like the Great Red Spot, which has been going for hundreds of years. Jupiter is a gas giant and doesn't have a solid surface, but it may have a solid inner core about the size of Earth. Jupiter also has rings, but they're too faint to see very well.Structure and Surface\n" +
                "Jupiter is the biggest planet in our solar system.\n" +
                "Jupiter is a gas giant. It is made mostly of hydrogen and helium.\n" +
                "Jupiter has a very thick atmosphere.\n" +
                "Jupiter has rings, but they’re very hard to see.\n" +
                "\n" +
                "Time on Jupiter\n" +
                "One day on Jupiter goes by in just 10 hours.\n" +
                "One year on Jupiter is the same as 11.8 Earth years.\n" +
                "\n" +
                "Jupiter's Neighbors\n" +
                "Jupiter has 95 known moons.\n" +
                "Jupiter is the fifth planet from the Sun. That means Mars and Saturn are Jupiter’s neighboring planets.\n" +
                "\n" +
                "Quick History\n" +
                "Jupiter has been known since ancient times because it can be seen without advanced telescopes.\n" +
                "Jupiter has been visited or passed by several spacecraft, orbiters and probes, such as Pioneer 10 and 11, Voyager 1 and 2, Cassini, New Horizons, and Juno."));
        planets.add(new PlanetData(R.drawable.saturn, "Saturn", "Saturn isn’t the only planet to have rings, but it definitely has the most beautiful ones. The rings we see are made of groups of tiny ringlets that surround Saturn. They’re made of chunks of ice and rock. Like Jupiter, Saturn is mostly a ball of hydrogen and helium.When Galileo Galilei saw Saturn through a telescope in the 1600s, he wasn't sure what he was seeing. At first he thought he was looking at three planets, or a planet with handles. Now we know those \"handles\" turned out to be the rings of Saturn.\n" +
                "\n" +
                "A cartoon Saturn smiling and saying, Everyone loves my rings.\n" +
                "Structure and Surface\n" +
                "Saturn is a gas giant like Jupiter. It is made mostly of hydrogen and helium.\n" +
                "Saturn has a thick atmosphere.\n" +
                "Saturn has a lovely set of seven main rings with spaces between them.\n" +
                "\n" +
                "Time on Saturn\n" +
                "One day on Saturn goes by in just 10.7 hours.\n" +
                "One year on Saturn is the same as 29 Earth years.\n" +
                "\n" +
                "Saturn's Neighbors\n" +
                "As of June 8, 2023, Saturn has 146 moons.\n" +
                "Saturn is the sixth planet from the Sun. That means Jupiter and Uranus are Saturn’s neighboring planets.\n" +
                "\n" +
                "Quick History\n" +
                "Saturn has been known since ancient times because it can be seen without advanced telescopes.\n" +
                "Four robotic spacecraft have visited Saturn, including Pioneer 11, Cassini, and Voyager 1 and 2"));
        planets.add(new PlanetData(R.drawable.uranus, "Uranus", "Uranus is made of water, methane, and ammonia fluids above a small rocky center. Its atmosphere is made of hydrogen and helium like Jupiter and Saturn, but it also has methane. The methane makes Uranus blue.Uranus also has faint rings. The inner rings are narrow and dark. The outer rings are brightly colored and easier to see. Like Venus, Uranus rotates in the opposite direction as most other planets. And unlike any other planet, Uranus rotates on its side.\n" +
                "\n" +
                "A cartoon of Uranus on its side, smiling and saying, I'm sideways!\n" +
                "Structure and Surface\n" +
                "Uranus is surrounded by a set of 13 rings.\n" +
                "Uranus is an ice giant (instead of a gas giant). It is mostly made of flowing icy materials above a solid core.\n" +
                "Uranus has a thick atmosphere made of methane, hydrogen, and helium.\n" +
                "Uranus is the only planet that spins on its side.\n" +
                "Uranus spins the opposite direction as Earth and most other planets.\n" +
                "\n" +
                "Time on Uranus\n" +
                "One day on Uranus lasts a little over 17 hours (17 hours and 14 minutes, to be exact).\n" +
                "One year on Uranus is the same as 84 years on Earth. That’s a long time to wait for a birthday cake.\n" +
                "\n" +
                "Uranus' Neighbors\n" +
                "Uranus has 27 known moons.\n" +
                "Uranus is the seventh planet from the Sun. That means Saturn and Neptune are Uranus’ neighboring planets.\n" +
                "\n" +
                "Quick History\n" +
                "Uranus was discovered in 1781 by William Herschel in Great Britain.\n" +
                "Uranus has only been visited by Voyager 2."));
        planets.add(new PlanetData(R.drawable.neptune, "Neptune", "Neptune is dark, cold, and very windy. It's the last of the planets in our solar system. It's more than 30 times as far from the sun as Earth is. Neptune is very similar to Uranus. It's made of a thick fog of water, ammonia, and methane over an Earth-sized solid center. Its atmosphere is made of hydrogen, helium, and methane. The methane gives Neptune the same blue color as Uranus. Neptune has six rings, but they're very hard to see.Structure and Surface\n" +
                "Neptune is encircled by six rings.\n" +
                "Neptune, like Uranus, is an ice giant. It’s similar to a gas giant. It is made of a thick soup of water, ammonia, and methane flowing over a solid core about the size of Earth.\n" +
                "Neptune has a thick, windy atmosphere.\n" +
                "\n" +
                "Time on Neptune\n" +
                "One day on Neptune goes by in 16 hours.\n" +
                "Neptune has such a long journey around the Sun it takes 165 Earth years to go around once. That’s a long year!\n" +
                "\n" +
                "Neptune's Neighbors\n" +
                "Neptune has 14 moons.\n" +
                "Neptune is the eighth and most distant planet from the Sun. That means Uranus is Neptune’s only neighboring planet.\n" +
                "\n" +
                "Quick History\n" +
                "Neptune was discovered in 1846 by Urbain Le Verrier, John Couch Adams, and Johann Galle.\n" +
                "Only Voyager 2 has visited Neptune."));
    }
}