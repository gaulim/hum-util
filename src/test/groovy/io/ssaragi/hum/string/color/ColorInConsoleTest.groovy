/**
 * hum-util
 * @author mrjozzz@gmail.com on 2019-06-19.
 */

import spock.lang.Specification
import spock.lang.Unroll


class ColorInConsoleTest extends Specification {

    private final int DEF_FG = 39
    private final int DEF_BG = 49
    private final def DEF_STYLE = "${(char)27}[${DEF_FG};${DEF_BG}m".toString()


    void setup() {
        println DEF_STYLE + '================================================================================'
    }


    void cleanup() {
        println DEF_STYLE + '================================================================================'
    }


    @Unroll
    def '색상 코드가 주어지면 해당 색깔로 글자를 출력한다 [전경: #fg, 배경: #bg]'() {
        setup:
            def text = "전경:${fg}, 배경:${bg} 문자열을 출력합니다.".toString()
            def style = "${(char)27}[${fg};${bg}m".toString()
            print style + text
            print DEF_STYLE + '\n'
    
        expect:
            true

        where:
            fg | bg
            30 | 47
            31 | 46
            32 | 45
            33 | 44
            34 | 43
            35 | 42
            36 | 41
            37 | 40
            38 | 48
            39 | 49
    }
}

// End of ColorInConsoleTest.groovy

