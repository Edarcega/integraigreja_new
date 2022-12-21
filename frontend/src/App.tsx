import NotificationButton from "./components/NotificationButton"
import Header from "./components/Header"
import IgrejaCard from "./components/IgrejaCard"


function App() {
  return (
    <>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <IgrejaCard />
          </div>
        </section>
      </main>
    </>
  )
}

export default App