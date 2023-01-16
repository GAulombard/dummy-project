<div id="top"></div>

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=coverage)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=bugs)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=GAulombard_dummy-project&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=GAulombard_dummy-project)


<!-- ABOUT THE PROJECT -->

# Dummy-project

This is just a useless project to help me learn thing about spring boot, how to docker my app, and how to implement
CI/CD with git hub. This project serve me as exemple as well t remember how to do things. Maybe it'll help you as well.

Here's why:

* This is a SpringBoot app wrote with JAVA
* This app works with a MySQL data base
* you can find a docker image of this app in Docker hub hod0r/dummy-api

I'm `GAulombard`.

## Built With

* [Maven 3.8.1](https://maven.apache.org/index.html)
* [Java 19](https://www.java.com/fr/)
* [SpringBoot 3](https://spring.io/projects/spring-boot)
* [Docker 20.1.21](https://www.docker.com/)
* [MySQL 8](https://www.mysql.com/fr/)

## Installation

Using docker. You'll first need to instal docker desktop form docker website

```bash
  docker network create spring-net
  docker run -d --net spring-net -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=rootroot -e MYSQL_DATABASE=dummy_db -v "./dummy_db":/var/lib/mysql mysql
  docker run -d --net spring-net -p 9090:8080 --name dummy-api -e MYSQL_HOST=mysqldb -e MYSQL_PASSWORD=rootroot -e MYSQL_USER=root -e MYSQL_PORT=3306 hod0r/dummy-api
```

after that you can check the documentation at this adress

```bash
http://localhost:9090/swagger-ui/index.html
```

## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any
contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also
simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch from (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request toward develop branch

<!-- LICENSE -->

## License

Distributed under the MIT License. See `LICENSE.txt` for more information.


<!-- CONTACT -->

## Contact

GAulombard - [@your_twitter](https://twitter.com/your_username) - GAulombard


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


