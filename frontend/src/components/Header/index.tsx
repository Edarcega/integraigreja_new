import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>Integra Igreja</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.ibjm.org.br">@ibjmoficial_</a>
                </p>
            </div>
        </header>
    )
}

export default Header