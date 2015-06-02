import org.gr8ladies.Gr8Lady
import org.gr8ladies.ContributionCategory

class BootStrap {

    def init = { servletContext ->
        environments {
            development {
                if (!Gr8Lady.count()) {
                    ContributionCategory programming = new ContributionCategory(name: 'Programming').save()
                    ContributionCategory hardware = new ContributionCategory(name: 'Hardware').save()

                    new Gr8Lady(
                        first: 'Ada',
                        maiden: 'Byron',
                        last: 'Lovelace',
                        lifetime: '1815-1852',
                        biography: 'Ada Byron, Lady Lovelace, was one of the most picturesque characters in computer history. August Ada Byron was born December 10, 1815 the daughter of the illustrious poet, Lord Byron. Five weeks after Ada was born Lady Byron asked for a separation from Lord Byron, and was awarded sole custody of Ada who she brought up to be a mathematician and scientist. Lady Byron was terrified that Ada might end up being a poet like her father. Despite Lady Byron\'s programming Ada did not sublimate her poetical inclinations. She hoped to be "an analyst and a metaphysician". In her 30\'s she wrote her mother, if you can\'t give me poetry, can\'t you give me "poetical science?" Her understanding of mathematics was laced with imagination, and described in metaphors.\n' +
                                'At the age of 17 Ada was introduced to Mary Somerville, a remarkable woman who translated LaPlace\'s works into English, and whose texts were used at Cambridge. Though Mrs. Somerville encouraged Ada in her mathematical studies, she also attempted to put mathematics and technology into an appropriate human context. It was at a dinner party at Mrs. Somerville\'s that Ada heard in November, 1834, Babbage\'s ideas for a new calculating engine, the Analytical Engine. He conjectured: what if a calculating engine could not only foresee but could act on that foresight. Ada was touched by the "universality of his ideas". Hardly anyone else was.\n' +
                                'Babbage worked on plans for this new engine and reported on the developments at a seminar in Turin, Italy in the autumn of 1841. An Italian, Menabrea, wrote a summary of what Babbage described and published an article in French about the development. Ada, in 1843, married to the Earl of Lovelace and the mother of three children under the age of eight, translated Menabrea\'s article. When she showed Babbage her translation he suggested that she add her own notes, which turned out to be three times the length of the original article. Letters between Babbage and Ada flew back and forth filled with fact and fantasy. In her article, published in 1843, Lady Lovelace\'s prescient comments included her predictions that such a machine might be used to compose complex music, to produce graphics, and would be used for both practical and scientific use. She was correct.\n' +
                                'When inspired Ada could be very focused and a mathematical taskmaster. Ada suggested to Babbage writing a plan for how the engine might calculate Bernoulli numbers. This plan, is now regarded as the first "computer program." A software language developed by the U.S. Department of Defense was named "Ada" in her honor in 1979.\n' +
                                'After she wrote the description of Babbage\'s Analytical Engine her life was plagued with illnesses, and her social life, in addition to Charles Babbage, included Sir David Brewster (the originator of the kaleidoscope), Charles Wheatstone, Charles Dickens and Michael Faraday. Her interests ranged from music to horses to calculating machines. She has been used as a character in Gibson and Sterling\'s the Difference Engine, shown writing letters to Babbage in the series " The Machine that Changed the World" and I have gathered her letters and writings in "Ada, The Enchantress of Numbers: A Selection from the Letters of Lord Byron\'s Daughter and Her Description of the First Computer Though her life was short (like her father, she died at 36), Ada anticipated by more than a century most of what we think is brand-new computing.',
                        contributionCategory: programming
                    ).save()

                    new Gr8Lady(
                        first: 'Grace',
                        maiden: 'Murray',
                        last: 'Hopper',
                        lifetime: '1906-1992',
                        biography: 'Grace Murray Hopper (December 9, 1906 – January 1, 1992) was an American computer scientist and United States Navy rear admiral. She was one of the first programmers of the Harvard Mark I computer in 1944, and invented the first compiler for a computer programming language, and was one of those who popularized the idea of machine-independent programming languages, which led to the development of COBOL, one of the first high-level programming languages. She is credited with popularizing the term "debugging" for fixing computer glitches (inspired by an actual moth removed from the computer). Owing to her accomplishments and her naval rank, she is sometimes referred to as "Amazing Grace". The U.S. Navy Arleigh Burke class guided-missile destroyer USS Hopper (DDG-70) is named for her, as was the Cray XE6 "Hopper" supercomputer at NERSC.',
                        contributionCategory: programming
                    ).save()

                    new Gr8Lady(
                        first: 'Hedy',
                        last: 'Lamarr',
                        middle: 'Eva Maria',
                        maiden: 'Kiesler',
                        lifetime: '1914-2000',
                        biography: 'Hedy Lamarr (born Hedwig Eva Maria Kiesler, 9 November 1914 – 19 January 2000) was an Austrian and American inventor and film actress. After an early and brief film career in Germany, which included a controversial love-making scene in the film Ecstasy (1933), she fled her husband and secretly moved to Paris. While there, she met MGM head Louis B. Mayer, who offered her a movie contract in Hollywood where she became a film star from the late 1930s to the 1950s.\n' +
                                '\n' +
                                'During her film career, Lamarr co-invented the technology for spread spectrum and frequency hopping communications with composer George Antheil. This new technology became important to America\'s military during World War II because it was used in controlling torpedoes. Those inventions have more recently been incorporated into Wi-Fi, CDMA and Bluetooth technology, and led to her being inducted into the National Inventors Hall of Fame in 2014.\n' +
                                '\n' +
                                'Lamarr appeared in numerous popular feature films, including Algiers (1938) with Charles Boyer, I Take This Woman (1940) with Spencer Tracy, Comrade X (1940) with Clark Gable, Come Live With Me (1941) with James Stewart, H.M. Pulham, Esq. (1941) with Robert Young, and Samson and Delilah (1949) with Victor Mature.',
                        contributionCategory: hardware
                    ).save()
                }
            }
        }
    }
    def destroy = {
    }
}
