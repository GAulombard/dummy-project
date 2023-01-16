<div id="top"></div>

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=coverage)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=bugs)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)


<!-- ABOUT THE PROJECT -->

## Dummy-project

There are many great README templates available on GitHub; however, I didn't find one that really suited my needs so I
created this enhanced one. I want to create a README template so amazing that it'll be the last one you ever need -- I
think this is it.

Here's why:

* Your time should be focused on creating something amazing. A project that solves a problem and helps others
* You shouldn't be doing the same tasks over and over like creating a README from scratch
* You should implement DRY principles to the rest of your life :smile:

Of course, no one template will serve all projects since your needs may be different. So I'll be adding more in the near
future. You may also suggest changes by forking this repo and creating a pull request or opening an issue. Thanks to all
the people have contributed to expanding this template!

Use the `BLANK_README.md` to get started.

### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for
the acknowledgements section. Here are a few examples.

* [Maven](https://nextjs.org/)
* [Java](https://reactjs.org/)
* [SpringBoot](https://vuejs.org/)
* [Docker](https://angular.io/)
* [MySQL](https://svelte.dev/)

<!-- GETTING STARTED -->

## Getting Started

This is an example of how you may give instructions on setting up your project locally.
To get a local copy up and running follow these simple example steps.

### Prerequisites

This is an example of how to list things you need to use the software and how to install them.

* npm
  ```sh
  npm install npm@latest -g
  ```

### Installation

1. Get a free API Key at [https://example.com](https://example.com)
2. Clone the repo
   ```sh
   git clone https://github.com/your_username_/Project-Name.git
   ```
3. Install NPM packages
   ```sh
   npm install
   ```
4. Enter your API in `config.js`
   ```js
   const API_KEY = 'ENTER YOUR API';
   ```

<!-- USAGE EXAMPLES -->

## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos
work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_



<!-- CONTRIBUTING -->

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also
simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.


<!-- CONTACT -->

## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)


<!-- ACKNOWLEDGMENTS -->

## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites
to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge

[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors

[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge

[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members

[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge

[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers

[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge

[issues-url]: https://github.com/othneildrew/Best-README-Template/issues

[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge

[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555

[linkedin-url]: https://linkedin.com/in/othneildrew

[product-screenshot]: images/screenshot.png

# dummy-project

http://localhost:8080/swagger-ui/index.html

mvn clean install
docker build -t dummy-api .

1 - docker network create spring-net
2 - docker run -d --net spring-net -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=rootroot -e
MYSQL_DATABASE=dummy_db -v "D:/Programming/_database/dummy_db":/var/lib/mysql mysql
3 - docker run -d --net spring-net -p 9090:8080 --name dummy-api -e MYSQL_HOST=mysqldb -e MYSQL_PASSWORD=rootroot -e
MYSQL_USER=root -e MYSQL_PORT=3306 hod0r/dummy-api

